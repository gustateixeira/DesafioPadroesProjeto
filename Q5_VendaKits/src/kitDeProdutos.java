import java.util.ArrayList;
import java.util.List;

public class KitDeProdutos implements ProdutoComponent {
    private int id;
    private String nome;
    private List<ProdutoComponent> produtos;

    public KitDeProdutos(int id, String nome) {
        this.id = id;
        this.nome = nome;
        this.produtos = new ArrayList<>();
    }

    public void adicionarProduto(ProdutoComponent produto) {
        produtos.add(produto);
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return produtos.stream().mapToDouble(ProdutoComponent::getPreco).sum();
    }
}
