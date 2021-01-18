package ejercicio;

import java.util.Scanner;

public class ejercio2tema3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int euros;
		
		float cambio;
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Bienvenido al programa conversor de euros a pesetas.");
		System.out.println("Introduzca la cantidad de euros que quiere pasar a pesetas");
		euros = sc.nextInt();
		
		System.out.println("La cantidad de euros que ha introducido es " + euros);
	
		
		cambio =(euros*166);
		
		
		
		System.out.println(euros + " euros, son " + cambio + " pesetas");
		
		sc.close();
		
	}

}
