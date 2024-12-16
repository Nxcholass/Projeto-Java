// HERAN�A
/* A heran�a � um principio da POO que permite a cria��o de
 * classes a partir de outras previamente criadas.
 * Essas novas classes s�o chamadas de subclasses, ou 
 * classes derivadas.
 * As classes que d�o origem as subclasses s�o chamadas de 
 * superclasses, ou classe base.
 * 
 * SuperClasse (m�e) = Atleta.java
 * SubClasse OU ClasseDerivada (filha) = Corredor.java
 * JogadorDeFutebol.java
 * */
public class Corredor extends Atleta {
	private double velocidadeMedia;
	private int numeroTenis;
	
	
	public double getVelocidadeMedia() {
		return velocidadeMedia;
	}
	public void setVelocidadeMedia(double velocidadeMedia) {
		this.velocidadeMedia = velocidadeMedia;
	}
	public int getNumeroTenis() {
		return numeroTenis;
	}
	public void setNumeroTenis(int numeroTenis) {
		this.numeroTenis = numeroTenis;
	}
	
}
