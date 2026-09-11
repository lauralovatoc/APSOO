package src;

// ConcreteCreator do FactoryMethod
public class FabricaDocumentoTexto implements FabricaDocumento{
	@Override 
	public Documento criarDocumento() { return new DocumentoTexto(); }
}
