
public class Main {

	public static void main(String[] args) {
		// Atleta.java
		Atleta atleta1 = new Atleta();
		atleta1.setValorPatrocinio(1000);
		atleta1.atualizarValor(20);
		System.out.println("Atleta: " + atleta1.getValorPatrocinio());
		
		Lutador lutador1 = new Lutador();
		lutador1.setValorPatrocinio(1000);
		lutador1.atualizarValor(20);
		System.out.println("Lutador: " + lutador1.getValorPatrocinio());
	}
}
