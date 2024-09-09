import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class VendasEmMemoria implements VendasFachada {
    private List<ProdutoComponent> produtos;

    public VendasEmMemoria() {
        produtos = new ArrayList<>();
        Produto caneta = new Produto(1, "Caneta", 1.55);
        Produto borracha = new Produto(2, "Borracha", 1.15);
        Produto caderno = new Produto(3, "Caderno", 32.99);

        KitDeProdutos kitEscola = new KitDeProdutos(4, "Kit Escolar");
        kitEscola.adicionarProduto(caneta);
        kitEscola.adicionarProduto(borracha);
        kitEscola.adicionarProduto(caderno);

        produtos.add(caneta);
        produtos.add(borracha);
        produtos.add(caderno);
        produtos.add(kitEscola);
    }

    public Venda iniciarVenda() {
        return new Venda(LocalDateTime.now());
    }

    public void registrarVenda(Venda umaVenda, int codigoProduto, int quantidade) {
        ProdutoComponent prod = produtos.stream()
            .filter(p -> p.getId() == codigoProduto)
            .findFirst()
            .orElseThrow(() -> new IllegalArgumentException("Produto não encontrado"));
        umaVenda.registrarVenda(prod, quantidade);
    }

    public String emitirComprovante(Venda umaVenda) {
        return umaVenda.emitirComprovante();
    }

    public List<Produto> buscarProdutos() {
        List<Produto> produtosSimples = new ArrayList<>();
        for (ProdutoComponent pc : produtos) {
            if (pc instanceof Produto) {
                produtosSimples.add((Produto) pc);
            }
        }
        return Collections.unmodifiableList(produtosSimples);
    }
}
