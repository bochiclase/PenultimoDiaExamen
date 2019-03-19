package examen;

public class Ejercicio2 {

	
	public static void escalera (int filas, int columnas) {
		for (int i =0; i<columnas;i++) {
			for(int a=0; a<i;a++)
				System.out.print("*");
				for (int p= 0; p<filas; p++) {
					System.out.print("*");
				}
			
				System.out.println();
		}
		
	}
	
	public static void main(String[] args) {
		escalera(5,10);
	}
}

