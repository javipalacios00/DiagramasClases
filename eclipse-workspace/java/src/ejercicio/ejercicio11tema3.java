package ejercicio;

import java.util.Scanner;

public class ejercicio11tema3 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double primerexamen;
		double segundoexamen;
		double media;
		double mediafinal;
		double mediexamen=0;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Dime la nota del primer examen");
		primerexamen = sc.nextInt();
		
		media = primerexamen * 0.4;
		
		System.out.println("Dime la media final que desea sacar");
		mediafinal = sc.nextInt();
		
		//mediafinal=((mediexamen)*(0.6))/media;
		
		System.out.println("La nota que debe de sacar en el segundo examen para sacar la media deseada es de " + mediexamen );
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		sc.close();
		
		
	}


}
