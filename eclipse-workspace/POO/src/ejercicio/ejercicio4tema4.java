package ejercicio;

import java.util.Scanner;

class ejercicio4tema4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int hora;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Dime la hora que es");
		
		hora = sc.nextInt();
		
		
		
		if (hora >=0  && hora <= 7) {
		
			System.out.println("Madrugada");
	
			}else if (hora >=8  && hora <= 11) {
			
			System.out.println("Mañana");
			
			}else if (hora >=12  && hora <= 15) {
		
			System.out.println("Mediodia");
		
			}else if (hora >=16  && hora <= 20) {
		
			System.out.println("Tarde");
			
			}else if (hora >=21  && hora <= 23) {
	
			System.out.println("Noche");
			
			sc.close();
}
	}
}
