// HERANÇA
/* A herança é um principio da POO que permite a criação de
 * classes a partir de outras previamente criadas.
 * Essas novas classes são chamadas de subclasses, ou 
 * classes derivadas.
 * As classes que dão origem as subclasses são chamadas de 
 * superclasses, ou classe base.
 * 
 * SuperClasse (mãe) = Atleta.java
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
