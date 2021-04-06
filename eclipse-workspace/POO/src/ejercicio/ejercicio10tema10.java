package ejercicio;

import java.util.Scanner;

public class ejercicio10tema10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int preciofinal;
		int descuento;
		int iva;
		double base;
		double facturaiva = 0;
		
		String general;
		String reducido;
		String superreducido;
	
		String codigo;
		String tipodeiva;
		
		double factura = 0;
		
		
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Dame la base del producto");
		base = sc.nextInt();
		
		System.out.println("Dime el tipo de iva");
		tipodeiva = sc.next();
		
		switch (tipodeiva){
		
		case "general":
			facturaiva = base * 0.21 ;
			
			
		
		case "reducido":
			facturaiva = base * 0.10;
				
				
		case "superreducido":
			facturaiva = base * 0.04;
			
			
		break;
		}
		
		
		System.out.println("Introduzca el codigo promocional");
		codigo = sc.next();
		
		switch (codigo){
			
			case "nopro":
				factura = facturaiva;
			case "mitad":
				factura = facturaiva * 0.5;
			case "meno5":
				factura = facturaiva - 5;
			case "5porc":
				factura = facturaiva * 0.05;
				
			break;
		}
		
		System.out.println(factura);
	
		
		
		
		sc.close();
		
		
		
		
		
	}

}
