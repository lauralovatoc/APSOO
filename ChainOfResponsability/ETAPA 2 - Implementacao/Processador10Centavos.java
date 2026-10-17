package src;

// Processador Concreto
public class Processador10Centavos extends ProcessadorMoeda{
	@Override
    public void processar(Moeda moeda, MaquinaDeVendas maquina) {
        if (Math.abs(moeda.getValor() - 0.10) < 0.001) {
            maquina.adicionarValor(0.10);
            System.out.println("-> Moeda de R$ 0.10 aceita.");
        } else if (sucessor != null) {
            sucessor.processar(moeda, maquina);
        } else {
            System.out.println("-> Moeda de R$ " + String.format("%.2f", moeda.getValor()) + " não aceita.");
        }
    }
}
