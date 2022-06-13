
package numeros_primos;
import java.io.*;
import java.util.*;
public class Gestor_NumerosPrimos {
	static int cantidad_primos;
	
	public static void escribir_Primos(int num_maximo, String nombre_archivo) {
		
		try {
			PrintWriter output;
			output=new PrintWriter(new FileWriter(nombre_archivo));
			for(int i=0;i<num_maximo;i++) {
				if(esPrimo(i)==true) {
					output.println(i);
					cantidad_primos++;
				}
			}output.close();
		}
		catch(IOException e) {
			System.out.println("Excepcion de E/S: " + e.toString());
		}
		
	}

	public static String Comprobar_Primo(int num_comprobar, String nombre_Archivo) {
		
		String no = "No es primo";
		
		if(num_comprobar <=200){
			try {
				BufferedReader input;
				input = new BufferedReader(new FileReader(nombre_Archivo));
				
				for(int i=0;i<cantidad_primos;i++) {
					int line=Integer.parseInt(input.readLine());
					if(num_comprobar==line) {
						no ="es primo";
					}
					
				}
				input.close();
			}
			catch(IOException e2) {
				System.out.println("I/O Exception :" + e2.toString());
			}
			
		}
		
		if(num_comprobar>200) {
			no="es primo";
			try {
				BufferedReader input_2;
				input_2=new BufferedReader(new FileReader(nombre_Archivo));
				
				for (int i=0;i<cantidad_primos;i++) {
					int line=Integer.parseInt(input_2.readLine());
					
					if(line<(int)Math.sqrt(num_comprobar))
						if(num_comprobar % line==0) {
							no="no es primo";
						}
				}
				input_2.close();
			}
			catch(IOException e2) {
				System.out.println("I/O Exception :" + e2.toString());
			}
		}
		
		return "El numero" + " " + num_comprobar + " " + no;
	}
	
	public static boolean esPrimo(int numero) {
		int contador=2;
		boolean primo =true;
		while((primo)&&(contador!=numero)) {
			if(numero % contador == 0) {
				primo=false;
				contador++;
			}
		} return primo;
		
	}
	
	public static void main(String[]args) {
		System.out.println("Inserte el numero maximo hasta el cual se van a escribir numero primos");
		Scanner reader=new Scanner(System.in);
		int numero=reader.nextInt();
		escribir_Primos(numero,"primos.dat");
		
		System.out.println("Inserte el numero que desea comprobar si es primo");
		Scanner reader_3 = new Scanner(System.in);
		int numero_2=reader_3.nextInt();
		System.out.println(Comprobar_Primo(numero_2,"primos.dat"));
		
	}
	
	
	
	
	
	
	
}
