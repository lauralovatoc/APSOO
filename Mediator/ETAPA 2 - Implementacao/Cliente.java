package src;

public class Cliente {
    public static void main(String[] args) {
        // Criação do Mediator
        Negociacao mediator = new NegociacaoConcreto();

        // Criação dos participantes auxiliares
        ConversorDolar conversor = new ConversorDolar();
        VendedorEUA vendedor = new VendedorEUA(500.00); // Preço mínimo de 500 dólares

        // Registo no Mediator
        mediator.registrarConversor(conversor);
        mediator.registrarVendedor(vendedor);
        

        CompradorBrasil compradorBrasil = new CompradorBrasil(mediator);
        CompradorFranca compradorFranca = new CompradorFranca(mediator);
        CompradorJapao compradorJapao = new CompradorJapao(mediator); // extensão do sistema

        mediator.registrarComprador(compradorBrasil);
        mediator.registrarComprador(compradorFranca);
        mediator.registrarComprador(compradorJapao); // extensão do sistema

        // Simulação de negociações
        System.out.println("--- Negociação 1 (Brasil) ---");
        compradorBrasil.fazerOferta(3000.0, "BRL"); // 3000 * 0.20 = 600 USD (Aceite)

        System.out.println("\n--- Negociação 2 (França) ---");
        compradorFranca.fazerOferta(400.0, "EUR");  // 400 * 1.10 = 440 USD (Rejeitado)
        
        System.out.println("--- Negociação 3 (Japão - Ienes) ---");
        compradorJapao.fazerOferta(90000.0, "JPY"); // 90000 * 0.0067 = ~603 USD (Aceite)
    }
}