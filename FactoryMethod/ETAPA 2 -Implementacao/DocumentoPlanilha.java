package src;

//ConcreteProduct do FactoryMethod
public class DocumentoPlanilha implements Documento{
	@Override 
	public void abrir() { System.out.println("Abrindo documento de planilha.."); }
    
	@Override 
	public void editar() { System.out.println("Editando documento de planilha..."); }
    
	@Override 
	public void salvar() { System.out.println("Salvando documento de planilha no disco."); }
}
