package EjercicioElectrodomesticos;

public class Televisor extends electrodomestico {

	private int pulgadas = 20;
	private String TDT ="Normal";

	
	public Televisor() {
		super();
		
	}

	public Televisor(char consumos, int tamaño, String tdt, int pulga) {
		super(consumos, tamaño);
		tdt=tdt.toLowerCase();
		if (tdt.equals("hd") ) {
			this.TDT= "HD";
		}
		else {
			this.TDT= "Normal";
		}
		this.pulgadas=pulga;
	}
	
	public Televisor(String tdt, int pulga) {
		super();
		tdt=tdt.toLowerCase();
		if (tdt.equals("hd") ) {
			this.TDT= "HD";
		}
		else {
			this.TDT= "Normal";
		}
		this.pulgadas=pulga;
		
	}
	



	public int getPulgadas() {
		return pulgadas;
	}

	public void setPulgadas(int pulgadas) {
		this.pulgadas = pulgadas;
	}

	public String getTDT() {
		return TDT;
	}

	public void setTDT(String tDT) {
		TDT = tDT;
	}

	@Override
	public String toString() {
		return "Televidor [pulgadas=" + pulgadas + ", TDT=" + TDT + " precio=" + getPrecio() + ", color=" + getColor() + ", consumo=" + getConsumo() + ", peso=" + getPeso()  + "  ]" ;
	}
	
	
}
