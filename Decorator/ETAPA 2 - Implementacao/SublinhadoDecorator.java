package src;

// ConcreteDecorator - sublinhado
public class SublinhadoDecorator extends EditorDecorator{
	public SublinhadoDecorator(EditorTexto editorDecorado) {super(editorDecorado);}

    @Override
    public String exibir() {return "<u>" + super.exibir() + "</u>";} // u de underlined
}
