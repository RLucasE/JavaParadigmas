package pruebasThread;


public class Deposito {
	private int elementos = 0;
	private int elemMax;
	
	public Deposito(int n) {
		this.elemMax = n;
	}
	
	public synchronized void poner(){
		try {
			if(this.elementos > this.elemMax) {
				System.out.println("Me wa dormir");
				this.wait();
			}
			
		}
		catch(InterruptedException e) { }
		this.elementos++;
		System.out.println("poner - nroElems: " + elementos);
		this.notify();
	}

	
	public synchronized void sacar(){
		try {
			if(elementos <= 0) {
				this.wait();
			}
			
		}
		catch(InterruptedException e) { }
		this.elementos--;
		System.out.println("sacar - nroElems: " + elementos);
		this.notify();
	}

	

}
