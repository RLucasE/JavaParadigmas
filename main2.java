package pruebasThread;

import java.util.Random;

public class main2 {

	public static void main(String[] args) {
		// TODO  Auto-generated method stub
		Random r = new Random();
		int m = 15000;
		int n = 15000;
		double[][] valores = new double[m][n];
		
		for(int i=0;i<valores.length;i++)
			for(int j=0;i<valores[0].length;i++)
				valores[i][j] = 1;
		
		Matriz ma1 = new Matriz(valores,0,7000);
		Matriz ma2 = new Matriz(valores,7000,15000);
		
		System.out.println("Suma normal:" + ma1.sumar());
	
		
		long tiempoInicio = System.nanoTime();
		
		ma1.start();
		ma2.start();
		
		ma1.setSuma(ma2.getSuma());
		
		long tiempoFin = System.nanoTime();
		long tiempoTranscurrido = tiempoFin - tiempoInicio;
		double segundos = (double) tiempoTranscurrido / 1_000_000_000.0;
		
		System.out.println("tiempo suma parcial: " + segundos);
		
		System.out.println("Suma parcial: " + ma1.getSuma());
		
	}

}
