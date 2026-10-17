package src;

// classe abstrata Processador do Chain Of Responsability
abstract class ProcessadorMoeda {
	protected ProcessadorMoeda sucessor;

	// método set
    public void setSucessor(ProcessadorMoeda sucessor) {this.sucessor = sucessor;}

    // Método abstrato que cada processador concreto implementará para validar e somar o valor
    public abstract void processar(Moeda moeda, MaquinaDeVendas maquina);
}
