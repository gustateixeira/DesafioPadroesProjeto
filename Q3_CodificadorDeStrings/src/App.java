public class App {
    public static void main(String[] args) throws Exception {
        String aux = "Desafio Padrões de Projeto";
        System.out.println(aux);
        ICodificaEDecodifica simples = new Simples(aux);
        ICodificaEDecodifica d = new Desloca(aux);
        aux = Controlador.codifica(simples);
        System.out.println(aux);
        aux = Controlador.decodifica(simples);
        aux = Controlador.codifica(d);
    }
}
