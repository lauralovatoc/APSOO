package src;

// RefinedAbstraction
public class Fanta extends Refrigerante {
    public Fanta(TamanhoRefrigerante tamanho) {super(tamanho);}

    @Override
    public void servir() {
        System.out.println("Servindo Fanta de " + tamanho.getTamanho() + ".");
    }
}
