package T1;

import java.util.Scanner;

public class ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nombre;
	
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Dime tu nombre");
		
		nombre = sc.nextLine();
		
		System.out.println("Hola " + nombre );
		
		sc.close();
	}

}
