package EjercicioElectrodomesticos;

public class electrodomestico {
	private int precio =100;
	private String color = "blanco";
	private char consumo = 'F';
	private int peso = 5;
	
	
	
	
	public electrodomestico() {
		this.precio = 100;
		this.color = "Blanco";
		this.consumo = 'F';
		this.peso = 5;
	}



	public electrodomestico (char consumos, int tamaño) {
		
		
		if (consumos == 'a') {
			this.precio = precio + 100;
			this.consumo = 'a';
		}
		else	if (consumos == 'b') {
			this.precio = precio+ 80;
			this.consumo = 'b';
		}
		else if (consumos== 'c') {
			this.precio =precio + 60;
			this.consumo = 'c';
		}
		else if (consumos == 'd') {
			this.precio =precio +50;
			this.consumo = 'd';
		}
		else if (consumos =='e') {
			this.precio= precio +30;
			this.consumo = 'e';
		}
		else if (consumos =='f') {
			this.precio= precio + 10;
			this.consumo = 'f';
		}
		else {
			this.precio = 100;
		}
		
		if (tamaño < 19) {
			this.precio = precio + 10;
			this.peso = tamaño;

		}
		else if (tamaño > 19 && tamaño < 49) {
			this.precio = precio +50;
			this.peso = tamaño;
		}
		else if (tamaño > 49 && tamaño< 79) {
			this.precio = precio + 80;
			this.peso = tamaño;
		}
		else {
			this.precio = precio +100;
			this.peso = tamaño;
		}
		
		
	}


	
	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public char getConsumo() {
		return consumo;
	}

	public void setConsumo(char consumo) {
		this.consumo = consumo;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	@Override
	public String toString() {
		return "electrodomestico [precio=" + precio + ", color=" + color + ", consumo=" + consumo + ", peso=" + peso
				+ "]";
	}
	
	
	
	
}
