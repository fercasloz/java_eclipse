package empleados;

public class Firm {

	public static void main(String[]args) {
		
		Staff staff=new Staff();
		StaffMember Fer = new Employee("7428748", 2500,
				"Fernando","san Javier","68985643");
		StaffMember Raquel = new Hourly("45",1500,
				"Raquel","Madrid","677589436",150);
		
		staff.add(Fer);
		staff.add(Raquel);
		staff.payday();
	}
}
