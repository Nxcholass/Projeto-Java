// Sobrescrita (override)
// Conceito relacionado a herança
/* A sobrescrita de método consiste basicamente em criar um 
 * método na classe filha contendo a mesma assinatura e 
 * mesmo tipo de retorno do método sobrescrito.
 * Os comportamentos desse método (sobrescrito) em geral 
 * são diferentes.
 * */
public class Lutador extends Atleta {
	private double peso;
	private int vitorias;
	private int derrotas;
	private int empates;
	private String nacionalidade;
	
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public int getVitorias() {
		return vitorias;
	}
	public void setVitorias(int vitorias) {
		this.vitorias = vitorias;
	}
	public int getDerrotas() {
		return derrotas;
	}
	public void setDerrotas(int derrotas) {
		this.derrotas = derrotas;
	}
	public int getEmpates() {
		return empates;
	}
	public void setEmpates(int empates) {
		this.empates = empates;
	}
	public String getNacionalidade() {
		return nacionalidade;
	}
	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	
	@Override
	public double atualizarValor(double taxa) {
		// super faz referência a classe mãe (SuperClass)
		return super.atualizarValor(taxa * 2);
	}
	
	
	
}
