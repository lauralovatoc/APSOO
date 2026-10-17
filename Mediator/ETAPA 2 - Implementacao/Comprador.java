package src;

// classe abstrata Colleague/Colaborador
public abstract class Comprador {
	protected Negociacao mediator;

    public Comprador(Negociacao mediator) {this.mediator = mediator;}

    public abstract void fazerOferta(double valor, String moeda);
    public abstract void receberResposta(String resposta);
}
