package ejercicio;

import java.util.Scanner;

public class ejercicio2tema4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		
		int max, suma = 0, repeticion;
		
		System.out.println("Cuantos numeros quieres que se sumen");
		
		

		max = sc.nextInt();
		
		for (int i = 1; i <= max ; i++) {
			
			
			
			System.out.println("Dame un valor");
			
			repeticion = sc.nextInt();
			
			suma = suma + repeticion;
			
			
			
			
			
			
		
		
		
	}
		System.out.println("La suma total es" + suma);

		sc.close();
}
}
