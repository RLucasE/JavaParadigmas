package pruebasThread;
import java.util.Random;

public class Mensaje extends Thread{
	private String msj;
	private int numeroA;
	
	public Mensaje(String mensaje) {
		this.msj = mensaje;				
	}
	
	public void run() {
		Random rand = new Random();
		for(int i=0;i<=100;i++) {
			this.numeroA= (rand.nextInt(10)+1)*1000;
			System.out.println(this.msj + this.numeroA);
		try {
			sleep(numeroA);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  }
	}
}

