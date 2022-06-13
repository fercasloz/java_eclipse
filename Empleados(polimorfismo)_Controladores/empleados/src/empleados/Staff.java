package empleados;

public class Staff {

	StaffMember staffList[]=new StaffMember[100];
	int cont=0;
	
	public void payday() {
		
		for(int i=0 ; i<cont ;i++) {
			System.out.println(staffList[i].toString());
			staffList[i].pay();
		}
		
	}
	public void add(StaffMember sm) {
		staffList[cont]=sm;
		cont++;
	}
	
	}

