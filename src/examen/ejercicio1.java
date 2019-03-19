package examen;

import java.util.Scanner;

public class ejercicio1 {

	
	private static boolean ejercicio1 (int numero, String c) {
		if (Integer.toString(numero).length() == 8) {
		return true;
		}
		else {
			return false;
		}

}
	
	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);
		System.out.println("escriba el numero");
		int p = n.nextInt();
		System.out.println("escriba la letra");
		String l = n.next();
		if (ejercicio1(p,"l")== true) {
			System.out.println("VALIDO");
		}
		else {
			System.out.println("FALSOOOO!!!!");
		}
		
	}
	
}
