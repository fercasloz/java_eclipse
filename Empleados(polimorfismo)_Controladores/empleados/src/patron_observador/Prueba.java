package patron_observador;

public class Prueba {

	public static void main(String[]args) {
		
		Sensor s1=new Sensor(12);
		
		MotorWindow mw1 = new MotorWindow(10);
		MotorWindow mw2 = new MotorWindow(9);
		
		Electric_controller ec1 = new 
				Electric_controller(8);
		Electric_controller ec2 = new 
				Electric_controller(7);
		
		s1.connect(mw1);
		s1.connect(mw2);
		s1.connect(ec1);
		s1.connect(ec2);
		
		System.out.println("Los valores actuales "
				+ "del motor 1 son : "+mw1.getData());
		System.out.println("Los valores actuales del"
				+ "motor 2 son : "+mw2.getData());
		
		System.out.println("Los valores actuales "
				+ "del controlador electrico"
				+ " 1 son : "+ec1.getData());
		System.out.println("Los valores actuales del"
				+ "controlador electrico"
				+ " 2 son : "+ec2.getData());
		
		mw1.updateData(12);
		s1.connect(mw1);
		System.out.println("Los valores del motor 1"
				+ "despues de la actualizacion son : "
				+ mw1.getData());
		
		
		

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
