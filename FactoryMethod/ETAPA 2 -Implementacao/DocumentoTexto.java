package src;

// ConcreteProduct do FactoryMethod
public class DocumentoTexto implements Documento{
	@Override 
	public void abrir() { System.out.println("Abrindo documento de texto..."); }
    
	@Override 
	public void editar() { System.out.println("Editando documento de texto..."); }
    
	@Override 
	public void salvar() { System.out.println("Salvando documento de texto no disco."); }

}
