package src;
import java.util.ArrayList;
import java.util.List;

// CLIENTE
public class MaquinaDeVendas {
    private List<Produto> catalogo;
    private Produto produtoSelecionado;
    private double valorInserido;
    private ProcessadorMoeda primeiraCadeia;

    public MaquinaDeVendas() {
        this.catalogo = new ArrayList<>();
        this.valorInserido = 0.0;
        configurarProdutos();
        configurarCadeia();
    }

    private void configurarProdutos() {
        catalogo.add(new Produto("Refrigerante", 1.50));
        catalogo.add(new Produto("Salgadinho", 2.00));
        catalogo.add(new Produto("Chocolate", 3.50));
    }

    private void configurarCadeia() {
        // Instanciando os Concrete Handlers
        ProcessadorMoeda p5c = new Processador5Centavos();
        ProcessadorMoeda p10c = new Processador10Centavos();
        ProcessadorMoeda p25c = new Processador25Centavos();
        ProcessadorMoeda p50c = new Processador50Centavos();
        ProcessadorMoeda p1r = new Processador1Real();
        ProcessadorMoeda p2r = new Processador2Reais();

        // Montando o encadeamento: 5c -> 10c -> 25c -> 50c -> R$ 1,00
        p5c.setSucessor(p10c);
        p10c.setSucessor(p25c);
        p25c.setSucessor(p50c);
        p50c.setSucessor(p1r);
        p1r.setSucessor(p2r);
        
        // ponta inicial da cadeia
        this.primeiraCadeia = p5c;
    }

    public void selecionarProduto(String nomeProduto) {
        for (Produto p : catalogo) {
            if (p.getNome().equalsIgnoreCase(nomeProduto)) {
                this.produtoSelecionado = p;
                System.out.println("Produto selecionado: " + p.getNome() + " - R$ " + String.format("%.2f", p.getPreco()));
                return;
            }
        }
        System.out.println("Produto não encontrado.");
    }

    public void inserirMoeda(double valor) {
        if (produtoSelecionado == null) {
            System.out.println("Por favor, selecione um produto antes de inserir moedas.");
            return;
        }
        
        Moeda moeda = new Moeda(valor);
        System.out.println("\nTentando inserir moeda de R$ " + String.format("%.2f", valor) + "...");
        
        // O Client inicia o processamento repassando para o primeiro elo da cadeia
        primeiraCadeia.processar(moeda, this);
        
        System.out.println("Valor acumulado atual: R$ " + String.format("%.2f", valorInserido));
        verificarCompra();
    }

    public void adicionarValor(double valor) {
        this.valorInserido += valor;
    }

    private void verificarCompra() {
        if (produtoSelecionado != null && valorInserido >= produtoSelecionado.getPreco()) {
            double troco = valorInserido - produtoSelecionado.getPreco();
            System.out.println("\n[SUCESSO] Produto liberado: " + produtoSelecionado.getNome() + "!");
            if (troco > 0) {
                System.out.println("Retire seu troco: R$ " + String.format("%.2f", troco));
            }
            resetarTransacao();
        }
    }

    private void resetarTransacao() {
        this.produtoSelecionado = null;
        this.valorInserido = 0.0;
        System.out.println("--------------------------------------------------");
    }

    // Método Main para simular a execução
    public static void main(String[] args) {
        MaquinaDeVendas maquina = new MaquinaDeVendas();

        // Cenário 1: Refrigerante (R$ 1,50) com R$ 1,00 + R$ 0,25 + R$ 0,25
        maquina.selecionarProduto("Refrigerante");
        maquina.inserirMoeda(1.00);
        maquina.inserirMoeda(0.25);
        maquina.inserirMoeda(0.25);

        // Cenário 2: Salgadinho (R$ 2,00) com valor superior gerando troco
        maquina.selecionarProduto("Salgadinho");
        maquina.inserirMoeda(1.00);
        maquina.inserirMoeda(1.00);
        maquina.inserirMoeda(0.50); // Deve liberar + R$ 0,50 de troco
        
        // Cenário 3: Extensão do sistema
        maquina.selecionarProduto("Chocolate");
        maquina.inserirMoeda(2.00); // Utilizando o novo Processador2Reais
        maquina.inserirMoeda(1.00);
    }
}