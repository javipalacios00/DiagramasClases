package ejercicio;

import java.util.Scanner;

public class ejercicio1tema3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1;
		int num2;
		int multiplicacion;
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Hola estimado usuario introduzca dos numeros por pantalla para realizar su multiplicacion");
		System.out.println("Introduzca el primer numero");
		num1 = sc.nextInt();
		System.out.println("Introduzca el segundo numero");
		num2 = sc.nextInt();
		
		multiplicacion = num1 * num2;
		
		System.out.println("El resultado de la multiplicacion es " + multiplicacion);
		
		sc.close();
		
	}

}
