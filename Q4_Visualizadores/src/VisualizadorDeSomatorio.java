import java.util.List;

public class VisualizadorDeSomatorio implements Observador{
    private List<Integer> valores;

    public void notifica(List<Integer> valores) {
        this.valores = valores;
    }

    public void ativa(){
        this.exibeValor();
    }

    public void exibeValor(){
        Integer soma = valores.stream()
            .mapToInt(Integer::intValue)
            .sum();
        System.out.println("Somatorio: "+soma+", quantidade de elementos analisados: "+valores.size());
    }
}
