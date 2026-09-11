package src;

// ConcreteProduct do FactoryMethod
public class DocumentoApresentacao implements Documento{
	@Override 
	public void abrir() { System.out.println("Abrindo documento de apresentação..."); }
    
	@Override 
	public void editar() { System.out.println("Editando documento de apresentação..."); }
    
	@Override 
	public void salvar() { System.out.println("Salvando documento de apresentação no disco."); }
}
