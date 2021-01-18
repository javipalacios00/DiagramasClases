package ejercicio;

import java.util.Scanner;

public class ejercicio6tema4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Scanner sc = new Scanner(System.in);
		
		int salario = 0, horas, extra, salariofinal, horasextra;
		
		System.out.println("Dime cuantas horas ha trabajdo el trabajador");
		horas = sc.nextInt();
		
		if (horas <40 ) {
		
			salario = horas * 12 ;
			
			System.out.println("Salario seria de " + salario );
			
		}
		
			else  {
				
				salario = 40 * 12;
				
				horasextra = (horas-40);
				
				salariofinal =  horasextra * 16 + salario;
				System.out.println("El salario seria de " + salariofinal);
				
				
			
			}
		sc.close();
		

	}

		
		
		
		



		
		
	}


