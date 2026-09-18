package src;

// extensão de sistema
public class CaixaAltaDecorator extends EditorDecorator{
	public CaixaAltaDecorator(EditorTexto editorDecorado) {super(editorDecorado);}

    @Override
    public String exibir() {return super.editorDecorado.exibir().toUpperCase();} // s de Strikethrough 
}
