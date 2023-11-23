package pruebasThread;

public class clsNavegador extends Thread{
	String url;
	clsHistorial historial;
	public clsNavegador(String u, clsHistorial h){
	this.url = u;
	this.historial = h;
	}
	
	public void mostrarHistorial() {
		this.historial.mostrar();
	}
	
	public void run(){
	for(int i= 0; i<100; i++){
	this.historial.agregar(this.url);
	}
	}
	
	
}
