package pruebasThread;

import java.util.Iterator;

public class Matriz extends Thread{
	private double[][] matriz;
	private int ini,fin;
	private double suma;
	
	public Matriz(double[][] matriz,int ini,int fin) {
		this.ini = ini;
		this.fin = fin;
		this.matriz = matriz;
		this.suma = 0;	
		}
	
	public void run() {
		this.sumaParcial();
	}
	
	public double getSuma() {
		return this.suma;
	}
	
	
	public void sumaParcial() {
		
		for(int i=ini;i< fin;i++) {
			for(int j=0;j< this.matriz[0].length;j++) {
				this.suma += this.matriz[i][j];
			}
			
			
		}
				
				
		
		
	
	}
	
	public synchronized void setSuma(double suma) {
		this.suma += suma;
	}
	
	public double sumar() {
		int m=0;
		long tiempoInicio = System.nanoTime();
		
		for(int i=0;i< this.matriz.length;i++) {
			for(int j=0;i<this.matriz[0].length;i++) {
				m += this.matriz[i][j];
			}
		}
		
		long tiempoFin = System.nanoTime();
		long tiempoTranscurrido = tiempoFin - tiempoInicio;
		double segundos = (double) tiempoTranscurrido / 1_000_000_000.0;
		
		System.out.println("Tiempo suma: " + segundos);
		
		
		
		return m;
	}
	
	
}
