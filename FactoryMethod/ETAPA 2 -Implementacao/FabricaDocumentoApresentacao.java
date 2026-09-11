package src;

//ConcreteCreator do FactoryMethod
public class FabricaDocumentoApresentacao implements FabricaDocumento{
	@Override
	public Documento criarDocumento() { return new DocumentoApresentacao(); }
}
