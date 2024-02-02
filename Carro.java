
public class Carro extends Veiculo{
	private int potenciaMotor;

	public Carro(String placa, int combustivel, int km, boolean alugado, double precoDiaria, int potencia) {
		super(placa, combustivel, km, alugado, precoDiaria);
		this.potenciaMotor = potencia;
	}
	
	public boolean viajar(int distancia) {
		int d = distancia / 10;
		if(this.getCombustivel() >= d) {
			return true;
		} else {
			return false;
		}
	}

	public String toString() {
		imprimirV();
		System.out.println("Potencia Motor: " + potenciaMotor);
		return null;
	}

	public int getPotencia() {
		return potenciaMotor;
	}
	public void setPotencia(int potencia) {
		this.potenciaMotor = potencia;
	}
}
