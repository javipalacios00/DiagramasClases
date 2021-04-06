package ejercicio;

import java.util.Scanner;

public class ejercicio5tema3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int area;
		int altura;
		int base;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Dame la base");
		base = sc.nextInt();
		System.out.println("Dame la altura");
		altura = sc.nextInt();
		System.out.println("");
		
		area = altura * base ;
		
		System.out.println("El area es de " + area + " metros cuadrados");
		
		sc.close();
		
		
	}

}
