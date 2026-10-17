package src;

public class VendedorEUA {
	private double precoMinimoDolar;

    public VendedorEUA(double precoMinimoDolar) {
        this.precoMinimoDolar = precoMinimoDolar;
    }

    public boolean avaliarOferta(double valorEmDolar) {
        return valorEmDolar >= precoMinimoDolar;
    }
}
