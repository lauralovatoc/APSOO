package src;

// exemplo de uso
public class Cliente {
public static void main(String[] args) {
        
        // editor de texto básico
        EditorTexto meuEditor = new EditorTextoSimples("Padrão de Projeto Estrutural Decorator");
        System.out.println("Texto Básico: " + meuEditor.exibir());

        // negrito
        meuEditor = new NegritoDecorator(meuEditor);
        System.out.println("Com Negrito:  " + meuEditor.exibir());

        // itálico
        meuEditor = new ItalicoDecorator(meuEditor);
        System.out.println("Com Itálico:  " + meuEditor.exibir());

        // sublinhado
        meuEditor = new SublinhadoDecorator(meuEditor);
        System.out.println("Com Sublinhado: " + meuEditor.exibir());
    
        // agora aidiconado extensões do sistema
        meuEditor = new TachadoDecorator(meuEditor);
        System.out.println("Com tachado:" + meuEditor.exibir());
        
        // em caixa alta
        meuEditor = new CaixaAltaDecorator(meuEditor);
        System.out.println("CAIXA ALTA:" + meuEditor.exibir());
	}
}
