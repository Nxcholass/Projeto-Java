import java.text.DecimalFormat;
import java.text.NumberFormat;

import javax.swing.JOptionPane;

// ENCAPSULAMENTO
// public - private - protected
public class Atleta {
	// Atributos
	private int codigo;
	private String nome;
	private String esporte;
	private double valorPatrocinio;
	
	// Get e Set - m�todos acessores 
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEsporte() {
		return esporte;
	}
	public void setEsporte(String esporte) {
		this.esporte = esporte;
	}
	public double getValorPatrocinio() {
		return valorPatrocinio;
	}
	public void setValorPatrocinio(double valorPatrocinio) {
		this.valorPatrocinio = valorPatrocinio;
	}
	
	public void inserirDados() {
		this.codigo = Integer.parseInt(JOptionPane.showInputDialog("C�digo"));
		this.nome = JOptionPane.showInputDialog("Nome");
		this.esporte = JOptionPane.showInputDialog("Esporte");
		this.valorPatrocinio = Double.parseDouble(JOptionPane.showInputDialog("Valor do pratoc�nio"));
	}
	
	public double atualizarValor(double taxa) {
		this.valorPatrocinio += this.valorPatrocinio * taxa / 100;
		return this.valorPatrocinio;
	}
	
	public void mostrar() {
		String mensagem = "Objeto da classe Atleta\n";
		mensagem += "\nC�digo: " + this.codigo;
		mensagem += "\nNome: " + this.nome;
		mensagem += "\nEsporte: " + this.esporte;
		
		NumberFormat formatar = DecimalFormat.getCurrencyInstance();
		
		mensagem += "\nPatroc�nio: " + formatar.format(this.valorPatrocinio);
		
		JOptionPane.showMessageDialog(null, mensagem);
	}
}