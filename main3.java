package pruebasThread;

public class main3 {

	public static void main(String[] arg){
		Deposito deposito = new Deposito(7);
		Productor p1 = new Productor(deposito);
		Productor p2 = new Productor(deposito);
		Consumidor c1 = new Consumidor(deposito);
		Consumidor c2 = new Consumidor(deposito);
		Consumidor c3 = new Consumidor(deposito);
		p1.start();
		p2.start();
		c1.start();
		c2.start();
		c3.start();
	}

}
