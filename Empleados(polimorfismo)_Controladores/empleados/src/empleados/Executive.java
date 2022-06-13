package empleados;

public class Executive extends Employee{

	protected double bonus;
	
	public Executive(String name_Ex, 
			String address_Ex, String phone_Ex, 
			String socialSecurityNumber_Ex,
			double payRate_Ex, double bn) {
		
		super(name_Ex,payRate_Ex, phone_Ex,
				socialSecurityNumber_Ex, address_Ex);
		
		bonus=bn;
		
	}
	
	public double pay() {
		return 3000;
	}
	
	public void awardBonus(double execBonus) {
		bonus=execBonus;
	}
 }
	
