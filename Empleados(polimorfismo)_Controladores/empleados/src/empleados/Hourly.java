package empleados;

public class Hourly extends Employee{

	protected int hoursWorked;
	
	public Hourly(String socialSecurityNumber_H,
			double payRate_H, String name_H, 
			String address_H, String phone_H, int horas) {
		
		super(socialSecurityNumber_H, payRate_H, 
				name_H, address_H, phone_H);
		hoursWorked=horas;
		
	}
	
	public double pay() {
		double dinero=(15*hoursWorked)+ payRate;
		return dinero;
	}
	
	public void addHours(int moreHours) {
		hoursWorked= hoursWorked + moreHours;
	}
	
	
	}

