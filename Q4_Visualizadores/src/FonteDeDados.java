import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class FonteDeDados{
    private List<Integer> lst;
    private List<Observador> observadores;
    private List<Observador> listaObservadoresAtivos;

    public FonteDeDados(){
        lst = new LinkedList<>();
        observadores = new ArrayList<>();
        listaObservadoresAtivos = new ArrayList<>();
    }
    
    public void registraObservador(Observador observador){
        this.observadores.add(observador);
        this.notificaObservador();
    }

    public void notificaObservador() {
        this.observadores.forEach(obs ->obs.notifica(this.getValores()));
    }

    public void ativaObservadores(Observador observador){
        if (!listaObservadoresAtivos.contains(observador)) {
            listaObservadoresAtivos.add(observador);
        }
        observador.ativa();
    }

    public void add(Integer value){
        if (value < 0) throw new IllegalArgumentException("Valor invalido");
        lst.add(value);
        this.notificaObservador();
    }

    public int quantidade(){
        return lst.size();
    }

    public List<Integer> getValores(){
        return new ArrayList<>(lst);
    }
}
