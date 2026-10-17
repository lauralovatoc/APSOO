package src;

// Processador Concreto
class Processador25Centavos extends ProcessadorMoeda {
    @Override
    public void processar(Moeda moeda, MaquinaDeVendas maquina) {
        if (Math.abs(moeda.getValor() - 0.25) < 0.001) {
            maquina.adicionarValor(0.25);
            System.out.println("-> Moeda de R$ 0.25 aceita.");
        } else if (sucessor != null) {
            sucessor.processar(moeda, maquina);
        } else {
            System.out.println("-> Moeda de R$ " + String.format("%.2f", moeda.getValor()) + " não aceita.");
        }
    }
}