package ejercicio;

import java.util.Scanner;

public class ejercicio1tema4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("3 aleatorios entre 65 y 90");
		 
		for (int i = 1; i <= 3 ; i++) {;
		
		System.out.print((int)(Math.random()*(90-65))+65 + " ");
		
		}
		
		System.out.println();
		
		sc.close();
	}

}
