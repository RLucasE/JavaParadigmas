package pruebasThread;

public class clsHistorial{
	String[] historial = new String[10000];
	int index = 0;
	public synchronized void agregar(String url){
		this.historial[index]= url;
		this.index++;
	}
	public void mostrar() {
		for(int i=0;i<50;i++) {
			System.out.println(this.historial[i]);
		}
	}
}
