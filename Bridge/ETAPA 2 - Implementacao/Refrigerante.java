package src;

// classe abstrata (Abstraction)
public abstract class Refrigerante {
	protected TamanhoRefrigerante tamanho;
	
	public Refrigerante(TamanhoRefrigerante tamanho) {this.tamanho = tamanho;}

    public abstract void servir();
}
