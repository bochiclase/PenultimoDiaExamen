package EjercicioElectrodomesticos;

public class Frigorificos extends electrodomestico {
	
	private String tipo = "Normal";


	public Frigorificos() {
		super();
		
	}

	public Frigorificos(char consumos, int tamaño, String tipos) {
		super(consumos, tamaño);
		tipos= tipos.toLowerCase();
		if (tipos == "normal") {
			this.tipo ="Normal";
		}
		else {
			this.tipo ="No Frost";
		}
		
	}
	
	public Frigorificos(String tipos) {
		super();
		tipos= tipos.toLowerCase();
		if (tipos == "normal") {
			this.tipo ="Normal";
		}
		else {
			this.tipo ="No Frost";
		}
	}
	
	
	
	
	
	public String getTipo() {
		return tipo;
	}
	

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Frigorificos[tipo=" + tipo + " precio=" + getPrecio() + ", color=" + getColor() + ", consumo=" + getConsumo() + ", peso=" + getPeso()  + "  ]" ;
	}
	
	

}
