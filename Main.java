package pruebasThread;

public class Main{
	public static void main(String arg[]){
	clsHistorial historial = new clsHistorial();
	clsNavegador n1 = new
	clsNavegador("www.google.com", historial);
	clsNavegador n2 = new
	clsNavegador("www.facebook.com", historial);
	n1.start();
	n2.start();
	try {
		n1.join();
		n2.join();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	};
	n1.mostrarHistorial();
	System.out.println("-----------");
	n2.mostrarHistorial();
	
	}
}
