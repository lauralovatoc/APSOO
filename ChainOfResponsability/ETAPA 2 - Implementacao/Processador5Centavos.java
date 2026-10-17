package src;

// Processador Concreto
public class Processador5Centavos extends ProcessadorMoeda{
	@Override
    public void processar(Moeda moeda, MaquinaDeVendas maquina) {
        if (Math.abs(moeda.getValor() - 0.05) < 0.001) {
            maquina.adicionarValor(0.05);
            System.out.println("-> Moeda de R$ 0.05 aceita.");
        } else if (sucessor != null) {
            sucessor.processar(moeda, maquina);
        } else {
            System.out.println("-> Moeda de R$ " + String.format("%.2f", moeda.getValor()) + " não aceita.");
        }
    }
}
