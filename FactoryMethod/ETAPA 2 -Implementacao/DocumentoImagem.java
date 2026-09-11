package src;


// etapa 3: extensão 
public class DocumentoImagem implements Documento{
	@Override 
	public void abrir() { System.out.println("Abrindo documento de imagem.."); }
    
	@Override 
	public void editar() { System.out.println("Editando documento de imagem..."); }
    
	@Override 
	public void salvar() { System.out.println("Salvando documento de imagem no disco."); }
}
