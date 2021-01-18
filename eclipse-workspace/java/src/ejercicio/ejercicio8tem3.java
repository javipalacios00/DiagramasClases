package ejercicio;

import java.util.Scanner;

public class ejercicio8tem3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int salario;
		int numhoras;
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Dime cuantas horas ha trabajado");
		numhoras = sc.nextInt();

		
		salario = (numhoras) * 12;
		System.out.println("El salario seria de " + salario + " euros");
		
		
		
		
		
		
		
		sc.close();
	}

	
}
