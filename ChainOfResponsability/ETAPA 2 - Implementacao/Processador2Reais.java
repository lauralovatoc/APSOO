package src;

// EXTENSÃO DO SISTEMA
public class Processador2Reais extends ProcessadorMoeda{
	@Override
    public void processar(Moeda moeda, MaquinaDeVendas maquina) {
        if (Math.abs(moeda.getValor() - 2.00) < 0.001) {
            maquina.adicionarValor(2.00);
            System.out.println("-> Moeda de R$ 2.00 aceita.");
        } else if (sucessor != null) {
            sucessor.processar(moeda, maquina);
        } else {
            System.out.println("-> Moeda de R$ " + String.format("%.2f", moeda.getValor()) + " não aceita.");
        }
    }
}
