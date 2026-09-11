package src;

//ConcreteCreator do FactoryMethod
public class FabricaDocumentoPlanilha implements FabricaDocumento{
	@Override 
	public Documento criarDocumento() { return new DocumentoPlanilha(); }
}
