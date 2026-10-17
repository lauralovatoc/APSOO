package src;

// ConcreteMediator, herda a classe abstrata Mediator
public class NegociacaoConcreto extends Negociacao{
	private CompradorBrasil compradorBrasil;
    private CompradorFranca compradorFranca;
    private CompradorJapao compradorJapao; // <-- Novo comprador adicionado
    private VendedorEUA vendedor;
    private ConversorDolar conversor;

    @Override
    public void registrarComprador(Comprador comprador) {
        if (comprador instanceof CompradorBrasil) {
            this.compradorBrasil = (CompradorBrasil) comprador;
        } else if (comprador instanceof CompradorFranca) {
            this.compradorFranca = (CompradorFranca) comprador;
        } else if (comprador instanceof CompradorJapao) {
            this.compradorJapao = (CompradorJapao) comprador; // <-- Tratamento do novo tipo
        }
    }

    @Override
    public void registrarVendedor(VendedorEUA vendedor) {
        this.vendedor = vendedor;
    }

    @Override
    public void registrarConversor(ConversorDolar conversor) {
        this.conversor = conversor;
    }

    @Override
    public String proporOferta(double valor, String moeda, Comprador comprador) {
        // 1. Solicita ao conversor a conversão para dólares
        double valorEmDolar = conversor.converterParaDolar(valor, moeda);
        
        // 2. Encaminha o valor convertido ao vendedor para verificação
        boolean aceita = vendedor.avaliarOferta(valorEmDolar);
        
        // 3. Define a resposta com base na avaliação do vendedor
        String resposta = aceita ? "Oferta aceita pelo vendedor dos EUA!" : "Oferta rejeitada (abaixo do preço mínimo).";
        
        // 4. Retorna a resposta para o comprador
        comprador.receberResposta(resposta);
        return resposta;
    }
}
