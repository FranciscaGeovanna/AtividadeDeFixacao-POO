
public class Moto extends Veiculo{
	private int cilindradas;

	public Moto(String placa, int combustivel, int km, boolean alugado, double precoDiaria, int cilindradas) {
		super(placa, combustivel, km, alugado, precoDiaria);
		this.cilindradas = cilindradas;
	}
	
	public boolean viajar(int distancia) {
		int d = distancia / 30;
		if(this.getCombustivel() >= d) {
			return true;
		} else {
			return false;
		}
	}

	public String toString() {
		imprimirV();
		System.out.println("Cilindradas: " + cilindradas);
		return null;
	}

	public int getCilindradas() {
		return cilindradas;
	}
	public void setCilindradas(int cilindradas) {
		this.cilindradas = cilindradas;
	}
}
