package src;

// ConcreteDecorator - italico
class ItalicoDecorator extends EditorDecorator {
	
    public ItalicoDecorator(EditorTexto editorDecorado) {super(editorDecorado);}

    @Override
    public String exibir() {return "<i>" + super.exibir() + "</i>";}
}