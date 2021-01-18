package ejercicio;

import java.util.Scanner;

public class ejercicio3tem4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int num, decenas, centenas, unidades;
		
		
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Introduce un numero entero de 3 cifras");
		
		num = sc.nextInt();
		
	
		centenas = num/100;
		
		decenas = (num/10%10);
		
		unidades = num % 10 ;
		
		
		
		
		System.out.println(centenas + " centenas");
		System.out.println(decenas + " decenas");
		System.out.println(unidades + " unidades");
		
		sc.close();
		
	}

}
