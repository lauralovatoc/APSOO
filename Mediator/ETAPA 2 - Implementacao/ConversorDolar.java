package src;

public class ConversorDolar {
	public double converterParaDolar(double valor, String moeda) {
		if (moeda.equalsIgnoreCase("BRL")) {
            // Conversão de Reais para Dólares (1 BRL = ~0.19 USD)
            return valor * 0.19; 
        } else if (moeda.equalsIgnoreCase("EUR")) {
            // Conversão de Euros para Dólares (1 EUR = ~1.13 USD)
            return valor * 1.13; 
		} else if (moeda.equalsIgnoreCase("JPY")) {
			return valor * 0.0067; // Ienes para Dólares (Exemplo de câmbio - JAPAO)
		}
        return valor; // Se já for Dólar
    }
}	
