package ejercicio;

import java.util.Scanner;

public class mayorEdad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int annio;
		String nombre;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Hola estimado usuario, indique su nombre:");
		nombre = sc.nextLine();
		System.out.println("Digame su edad");
		annio = sc.nextInt();
		System.out.println("Hola " + " " + nombre);
		System.out.println("Tienes " + annio);
		System.out.println();
		
		if (annio >=18) {
			System.out.println(nombre + " Eres mayor de edad");
		}else {
			System.out.println("Vaya " + nombre + " no puedes entrar a la discoteca");
		}
		
		/* if (!nombre.equalsIgnoreCase("Jacobo")) {
			
			System.out.println("Puedes pasar a la clase de SQL");
		}
		
		*/
		
		for (int i=annio; i>=0; i--) {
		System.out.println("La edad de "+ nombre + " es > " + i);
		}
		sc.close();
		
	}

}

