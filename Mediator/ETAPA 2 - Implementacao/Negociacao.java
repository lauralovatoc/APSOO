package src;

// classe abstrata Mediator
public abstract class Negociacao {
	public abstract String proporOferta(double valor, String moeda, Comprador comprador);
    public abstract void registrarComprador(Comprador comprador);
    public abstract void registrarVendedor(VendedorEUA vendedor);
    public abstract void registrarConversor(ConversorDolar conversor);
}
