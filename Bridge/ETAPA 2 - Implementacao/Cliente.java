package src;

public class Cliente {
	public static void main(String[] args) {
        // Criando uma Coca-Cola de 600ml
        Refrigerante coca600 = new CocaCola(new Tamanho600Ml());
        coca600.servir();

        // Criando uma Fanta de 200ml
        Refrigerante fanta200 = new Fanta(new Tamanho200Ml());
        fanta200.servir();
    }
}
