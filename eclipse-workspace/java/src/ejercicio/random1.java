package ejercicio;

public class random1 {

	public static void main(String[] args) {
        // TODO Auto-generated method stub

        System.out.println("10 aleat entre 1 y 100 :");
        for (int i = 1; i <= 10; i++) {
            System.out.print((int)(Math.random()*100+1) + " ");
        }
    }
}