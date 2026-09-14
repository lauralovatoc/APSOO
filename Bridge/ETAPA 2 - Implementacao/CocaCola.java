package src;

// RefinedAbstraction
public class CocaCola extends Refrigerante {
    public CocaCola(TamanhoRefrigerante tamanho) {super(tamanho);}

    @Override
    public void servir() {
        System.out.println("Servindo Coca-Cola de " + tamanho.getTamanho() + ".");
    }
}