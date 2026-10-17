package src;

// Processador Concreto
class Processador1Real extends ProcessadorMoeda {
    @Override
    public void processar(Moeda moeda, MaquinaDeVendas maquina) {
        if (Math.abs(moeda.getValor() - 1.00) < 0.001) {
            maquina.adicionarValor(1.00);
            System.out.println("-> Moeda de R$ 1.00 aceita.");
        } else if (sucessor != null) {
            sucessor.processar(moeda, maquina);
        } else {
            System.out.println("-> Moeda de R$ " + String.format("%.2f", moeda.getValor()) + " não aceita.");
        }
    }
}
