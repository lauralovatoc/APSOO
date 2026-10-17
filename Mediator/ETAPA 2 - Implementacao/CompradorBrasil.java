package src;

//ConcreteColleague ou colaborador concreto, herda a classe abstrata Comprador
public class CompradorBrasil extends Comprador {
    public CompradorBrasil(Negociacao mediator) {
        super(mediator);
    }

    @Override
    public void fazerOferta(double valor, String moeda) {
        System.out.println("Comprador Brasileiro a propor " + valor + " " + moeda);
        mediator.proporOferta(valor, moeda, this);
    }

    @Override
    public void receberResposta(String resposta) {
        System.out.println("Comprador Brasileiro recebeu resposta: " + resposta);
    }
}