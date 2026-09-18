package src;

// ConcreteComponent
public class EditorTextoSimples extends EditorTexto{
	private String texto;

	// construtor da classe
    public EditorTextoSimples(String texto) {this.texto = texto;}

    @Override
    public String exibir() {return this.texto;}
}
