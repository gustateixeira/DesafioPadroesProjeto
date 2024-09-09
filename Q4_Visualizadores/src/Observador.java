import java.util.List;

public interface Observador {
    public void notifica(List<Integer> l);

    public void ativa();

    public void exibeValor();
}
