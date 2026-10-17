package src;

// ConcreteColleague ou colaborador concreto, herda a classe abstrata Comprador
public class CompradorFranca extends Comprador {
    public CompradorFranca(Negociacao mediator) {
        super(mediator);
    }

    @Override
    public void fazerOferta(double valor, String moeda) {
        System.out.println("Comprador Francês a propor " + valor + " " + moeda);
        mediator.proporOferta(valor, moeda, this);
    }

    @Override
    public void receberResposta(String resposta) {
        System.out.println("Comprador Francês recebeu resposta: " + resposta);
    }
}