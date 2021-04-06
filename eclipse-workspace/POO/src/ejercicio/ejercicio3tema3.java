package ejercicio;

import java.util.Scanner;

public class ejercicio3tema3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1;
		int num2;
		
		int suma;
		int resta;
		int multiplicacion;
		
		
		Scanner sc= new Scanner (System.in);
		
		
		System.out.println("Bienvenido al prgrama que realizara la suma, resta, multiplicacion y division de 2 numeros");
		
		System.out.println("Introduzca el primer numero");
		num1 = sc.nextInt();
		System.out.println("Introduzca el segundo numero");
		num2 = sc.nextInt();
		
		suma = num1 + num2;
		
		resta = num1 - num2;
		
		multiplicacion = num1 * num2;
	
		System.out.println("El resultado de la suma es de " + suma);
		
		System.out.println("El resultado de la resta es de " + resta);
		
		System.out.println("El resultado de la multiplicacion es de " + multiplicacion);
		
		sc.close();
		
		
		
		
		
		
		
		
		
		
	}

}
