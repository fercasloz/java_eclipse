package patron_observador;

public class MotorWindow extends ControlWindow 
implements Observador{
	int dato;
	
	public MotorWindow(int d) {
		dato=d;
	}
	public int getData() {
		return dato;
	}
	
	public void updateData(int dato_nuevo) {
		dato=dato_nuevo;
	}

}
