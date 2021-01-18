package ejercicio;

import java.util.Scanner;

public class ejercicio7tema3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double base;
		
		double total;
		
		double factura;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Dame la base impoible de la factura");
		base = sc.nextInt();
		
		factura = base * (0.21);

		total = factura + base;
		
		System.out.println("La factura total es de " + total);
		

		
		
		
		sc.close();
		
		
		
		
		
		
	}

}
