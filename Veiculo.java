
public abstract class Veiculo {
	private String placa;
	private int combustivel;
	private int km;
	private boolean alugado;
	private double precoDiaria;
	
	public Veiculo(String placa, int combustivel, int km, boolean alugado, double precoDiaria) {
		this.alugado = alugado;
		this.combustivel = combustivel;
		this.km = km;
		this.placa = placa;
		this.precoDiaria = precoDiaria;
	}
	
	public void imprimirV() {
		System.out.println("Placa: " + placa + "\nCombustivel: " + combustivel + "\nQuilometragem: " + km + "\nAlugado: " + alugado + "\nPreço Diaria: R$" + precoDiaria);
	}
	
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	
	public int getCombustivel() {
		return combustivel;
	}
	public void setCombustivel(int combustivel) {
		this.combustivel = combustivel;
	}
	
	public int getKm() {
		return km;
	}
	public void setKm(int km) {
		this.km = km;
	}
	
	public boolean isAlugado() {
		return alugado;
	}
	public void setAlugado(boolean alugado) {
		this.alugado = alugado;
	}
	
	public double getPrecoDiaria() {
		return precoDiaria;
	}
	public void setPrecoDiaria(double precoDiaria) {
		this.precoDiaria = precoDiaria;
	}
	
	public void abastecer(int combustivel) {
		this.combustivel += combustivel;
	}
	
	public abstract boolean viajar(int distancia);
	public abstract String toString();
	
	public boolean Equals(Veiculo p) {
		if(this.placa.equals(p.placa)) {
			return true;
		} else {
			return false;
		}
	}

}
