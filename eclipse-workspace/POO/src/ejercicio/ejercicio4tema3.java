package ejercicio;

import java.util.Scanner;

public class ejercicio4tema3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int edad;
		
		
		
		
		Scanner sc=new Scanner (System.in);
		
		System.out.println("Dime tu edad");
		
		edad = sc.nextInt();
		
		if (edad >= 18) {
			
			System.out.println("Eres mayor de edad");
			
		}
		
		else {
		System.out.println("No eres mayor de edad");
		
		}
		sc.close();
	}

}
