
public class TestarVeiculo {

	public static void main(String[] args) {
		Moto m1 = new Moto("BAR813", 5, 10, true, 100, 125);
		Carro c1 = new Carro("BRS248", 50, 20, true, 250, 300);
		
		m1.toString();
		System.out.println("\n");
		c1.toString();
		
		System.out.println(m1.viajar(30));
		System.out.println(c1.viajar(100));
		
		System.out.println(m1.Equals(m1));
	}

}
