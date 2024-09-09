import java.util.List;

public class VisualizadorDeSomQuadrado implements Observador{
    private List<Integer> valores;

    public void notifica(List<Integer> valores) {
        this.valores = valores;
    }

    public void ativa(){
        this.exibeValor();
    }

    public void exibeValor(){
        Integer soma = valores.stream()
            .mapToInt(valor -> valor * valor)
            .sum();
        System.out.println("Somatorio ao Quadrado: "+soma+", quantidade de elementos analisados: "+valores.size());
    }
}
