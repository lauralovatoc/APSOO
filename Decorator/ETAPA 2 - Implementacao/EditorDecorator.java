package src;

// Decorator
public abstract class EditorDecorator extends EditorTexto{
	protected EditorTexto editorDecorado; // agregação

    public EditorDecorator(EditorTexto editorDecorado) {this.editorDecorado = editorDecorado;}

    @Override
    public String exibir() {return editorDecorado.exibir();}
}
