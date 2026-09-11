package src;

// etapa 3: extensão
public class FabricaDocumentoImagem implements FabricaDocumento{
	@Override 
	public Documento criarDocumento() { return new DocumentoImagem(); }
}
