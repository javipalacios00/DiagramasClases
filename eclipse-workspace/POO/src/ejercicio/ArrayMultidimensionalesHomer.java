package ejercicio;

import java.util.Scanner;

public class ArrayMultidimensionalesHomer {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		
		int [][]n=new int [3][2];
		

		int fila;
		int columna;
		for ( fila = 0; fila < 3; fila++) { 
			
			
			
			for ( columna = 0; columna< 2; columna++) {
				System.out.println("Dime la posicion " + (fila+1) + " " + (columna+1));
				
				n[fila][columna]= sc.nextInt();
		
				System.out.print("ValorFila: "+ (fila));
				
				
				System.out.println("\t ValorColumna: "+n[fila][columna]);
				System.out.println();
				
			}
		
		
			
		}
		
		
		sc.close();
		
}
}