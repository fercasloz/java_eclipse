package patron_observador;

public class Sensor {

	Observador[]vector_observadores= new Observador[10];
	int cont;
	int Data;
	
	public Sensor( int d){
		Data=d;
	}
	
	public int getData() {
		return Data;
	}
	
	public void connect(Observador obs) {
		vector_observadores[cont]=obs;
		cont++;
	}
}
