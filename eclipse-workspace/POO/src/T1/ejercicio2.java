package T1;

import java.util.Scanner;

public class ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nombre, direccion, telefono;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Dime tu nombre");
		
		nombre = sc.nextLine();
		
		System.out.println("Dime tu direccion");
		
		direccion = sc.nextLine();
		
		System.out.println("Dime tu numero de telefono");
		
		telefono = sc.nextLine();
		
		System.out.println("Hola " + nombre + ".");
		
		System.out.println("Tu direccion es " + direccion + ".");
		
		System.out.println("Tu numero de telefono es " + telefono + ".");
		
		sc.close();
	}

}
