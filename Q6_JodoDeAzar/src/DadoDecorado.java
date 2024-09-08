import java.util.ArrayList;
/*
Classe que aplica o padrao Decorator para Dado.
Essa classe vai adicionar a funcionalidade de obter o historico
para qualquer objeto que implemente a interface dado.
 */
public class DadoDecorado implements InterfaceDado{
    private InterfaceDado dado;
    private ArrayList<Integer> historico;

    public DadoDecorado(InterfaceDado dado) {
        this.dado = dado;
        this.historico = new ArrayList<>();
    }

    @Override
    public void rolar() {
        dado.rolar();
        historico.add(dado.getValor());
    }

    @Override
    public int getValor() {
        return dado.getValor();
    }

    public ArrayList<Integer> getHistorico() {
        return historico;
    }
}
