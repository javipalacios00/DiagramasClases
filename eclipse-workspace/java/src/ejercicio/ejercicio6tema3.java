package ejercicio;


import java.util.Scanner;

public class ejercicio6tema3 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	double num;
	
	double cubo;
	
	

	Scanner sc = new Scanner (System.in);
	
	System.out.println("Dame un numero para calcular su cubo");
	num = sc.nextInt();
	
	cubo = Math.pow(num, 3);
	System.out.println("El cubo de " + num + " es " + cubo);
	
	sc.close();
}
}

