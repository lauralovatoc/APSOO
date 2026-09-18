package src;

// ConcreteDecorator - negrito
public class NegritoDecorator extends EditorDecorator{
	public NegritoDecorator(EditorTexto editorDecorado) {super(editorDecorado);}

    @Override
    public String exibir() {return "<b>" + super.exibir() + "</b>";} // b de bold
}
