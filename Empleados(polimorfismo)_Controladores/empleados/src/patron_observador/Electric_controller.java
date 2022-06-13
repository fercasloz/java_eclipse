package patron_observador;

public class Electric_controller extends Controller 
implements Observador{

	int dato;
		
	public Electric_controller(int d) {
		dato=d;
	}
	public int getData() {
		return dato;
	}
	public void updateData(int dato_nuevo) {		
		dato=dato_nuevo;		
	}

}
