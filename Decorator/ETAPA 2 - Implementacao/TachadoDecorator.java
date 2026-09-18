package src;

// extensão do sistema
public class TachadoDecorator extends EditorDecorator{
	public TachadoDecorator(EditorTexto editorDecorado) {super(editorDecorado);}

    @Override
    public String exibir() {return "<s>" + super.exibir() + "</s>";} // s de Strikethrough 
}
