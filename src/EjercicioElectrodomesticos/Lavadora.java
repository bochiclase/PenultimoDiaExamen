package EjercicioElectrodomesticos;

public class Lavadora extends electrodomestico{
	
	private int carga;
	
	
	

	public Lavadora() {
		super();
		this.carga=5;
	}


	public Lavadora(char consumos, int tamaño, int cargas) {
		super(consumos, tamaño);
		if (cargas > 8) {
			setPrecio(getPrecio()+50);
			carga= cargas;
			
		}
		else {
			carga = cargas;
		}
	}
	
	public Lavadora(int cargas) {
		if (cargas > 8) {
			setPrecio(getPrecio()+50);
			carga=cargas;
		}
		else {
			carga = cargas;
		}
	}


	public int getCarga() {
		return carga;
	}


	public void setCarga(int carga) {
		this.carga = carga;
	}


	@Override
	public String toString() {
		return "Lavadora [carga=" + carga + " precio=" + getPrecio() + ", color=" + getColor() + ", consumo=" + getConsumo() + ", peso=" + getPeso()  + "  ]" ;
	}


	
}
