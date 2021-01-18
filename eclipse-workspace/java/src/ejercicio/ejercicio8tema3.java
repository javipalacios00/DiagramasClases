package ejercicio;

import java.util.Scanner;

class ejercicio8tema3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int mb;
		int kb;
		int total1;
		int total2;
		
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Dime cuantos Mb quireres pasar a Kb");
		mb = sc.nextInt();
		total1 = (mb) * 1024;
		System.out.println(mb + " Mb, son " + total1 + "Kb");
		
		System.out.println("Ahora dime los Kb que quieres pasar a Mb");
		kb = sc.nextInt();
		total2 = (kb)/1024;
		System.out.println(kb + " Kb, son " + total2 + " Mb");
		
		sc.close();
		
		
		
		
		
		
		
		
	}

}
