package src;

// extensão do sistema
public class CompradorJapao extends Comprador {
	public CompradorJapao(Negociacao mediator) {
        super(mediator);
    }

    @Override
    public void fazerOferta(double valor, String moeda) {
        System.out.println("Comprador Japonês a propor " + valor + " " + moeda);
        mediator.proporOferta(valor, moeda, this);
    }

    @Override
    public void receberResposta(String resposta) {
        System.out.println("Comprador Japonês recebeu resposta: " + resposta);
    }
}
