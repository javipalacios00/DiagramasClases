package ejercicio;

import java.util.Scanner;

public class ArrayHomerBienHecho {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		double [] n = new double [19];
		
		for (int i = 0; i <= n.length-1; i++){
		
		System.out.println("Dime la nota del alumno " + (i+1) );
		
		n[i]= sc.nextDouble();
		
		}
		System.out.println("----------------------------");
		
		double media = 0;
		
		for (int i = 0; i <= n.length-1; i++) {
			
			System.out.println("La nota del alumno " + (i+1) + " es " + n[i]);
			
			System.out.println("----------------------------------");
			
			media = media + n[i] ;
			
		}
			System.out.println("La nota media de la clase es " + media/n.length);

		
			
			sc.close();
			
			
		
		}

}

