import java.util.List;

public class App {
    public static void main(String[] args){
        VendasFachada proc = new VendasEmMemoria();
        List<Produto> produtos = proc.buscarProdutos();
        Venda venda = proc.iniciarVenda();
        
        proc.registrarVenda(venda, produtos.get(0).getId(), 1); 

        proc.registrarVenda(venda, produtos.get(2).getId(), 1); 

        System.out.println(proc.emitirComprovante(venda));
    }
}
