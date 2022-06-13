package empleados;

public abstract class StaffMember {

	protected String name;
	protected String address;
	protected String phone;
	
	public StaffMember(String n , String a , String p) {
		
		name=n;
		address=a;
		phone=p;
	}
	
	public abstract String toString();

	public abstract double pay() ;
	
	
}
