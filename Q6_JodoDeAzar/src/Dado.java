import java.util.Random;
/*
Agora implementa interface Dado para que possa receber
as adiçoes de objetos "decoradores"
 */
public class Dado implements InterfaceDado{
    private int lados;
    private int valorJogada;
    private final Random random;

    public Dado(int lados) {
        this.lados = lados;
        this.random = new Random();
    }

    public void rolar() {
        valorJogada = random.nextInt(lados) + 1;
    }

    public int getValor() {
        return valorJogada;
    }
}
