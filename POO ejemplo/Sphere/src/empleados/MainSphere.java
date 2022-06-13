package empleados;

public class MainSphere {
	
	public static void main(String[]args) {
		Sphere vector[]=new Sphere[4];
		
		for (int i=0;i<vector.length;i++) {
			vector[i]=new Sphere (Math.random());
			System.out.println(vector[i].toString());
		}
	}

}

