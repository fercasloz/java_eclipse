package empleados;

public class Employee extends StaffMember{
	
	protected String socialSecurityNumber;
	protected double payRate;
	
	public Employee(String SSN , double PR , String name_E
			, String address_E, String phone_E) {
		
		super(name_E, address_E, phone_E);
		socialSecurityNumber=SSN;
		payRate=PR;
		
		
	}
	
	public double pay() {
		return payRate;
	}
	
	public String toString() {
		return "Soy un empleado y me llamo " + name+ 
				" y cobro : " + payRate;
	}
	
	

}
