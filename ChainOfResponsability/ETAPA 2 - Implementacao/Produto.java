package src;

// classe auxiliar
public class Produto {
	private String nome;
    private double preco;

    // construtor
    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    // métodos getters 
    public String getNome() {return nome;}
    public double getPreco() {return preco;}
}
