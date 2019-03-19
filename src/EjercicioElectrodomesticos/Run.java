package EjercicioElectrodomesticos;

import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
	Lavadora lava = new Lavadora();
	System.out.println(lava);
		Scanner r = new Scanner(System.in);
		//System.out.println("EScribe un color");
		//String s = r.next();
		//electro.setColor(s);
		System.out.println("El color es " + lava.getColor());
		lava.setCarga(18);
		System.out.println(lava);
		electrodomestico electro = new electrodomestico();
		System.out.println(electro);
		electrodomestico elec2 = new electrodomestico('a',50);
		System.out.println(elec2);
		Lavadora lava2 = new Lavadora('a',50,18);
		System.out.println(lava2);
		Frigorificos frigo = new Frigorificos('a', 50, "No Frost");
		System.out.println(frigo);
		Televisor tele = new Televisor("HD",25);
		System.out.println(tele);
		r.close();
	}
	
}
