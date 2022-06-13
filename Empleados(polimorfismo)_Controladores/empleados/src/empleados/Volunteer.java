package empleados;

public class Volunteer extends StaffMember{
	
	public Volunteer(String name_v, String address_v,
			String phone_v) {
		
		super(name_v, address_v, phone_v);
		
	}
	
	public double pay() {
		return 500;
	}
	
	public String toString() {
		return "Soy voluntario";
	}

}
