import java.util.List;

public class VisualizadorDeMedia implements Observador {
    private List<Integer> valores;

    public void notifica(List<Integer> valores) {
        this.valores = valores;
        
    }

    public void ativa(){
        this.exibeValor();
    }
    
    public void exibeValor(){
        double media = valores.stream()
            .mapToInt(Integer::intValue)
            .average()
            .orElse(0.0);
        System.out.println("Media: "+media+", quantidade de elementos analisados: "+valores.size());
    }
}
