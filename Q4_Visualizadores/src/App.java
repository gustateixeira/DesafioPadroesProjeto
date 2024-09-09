import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        var dados = new FonteDeDados();
        var cm = new VisualizadorDeMedia();
        var cs = new VisualizadorDeSomatorio();
        var csq = new VisualizadorDeSomQuadrado();

        dados.registraObservador(cm);
        dados.registraObservador(cs);
        dados.registraObservador(csq);

        Scanner s = new Scanner(System.in);
        int valor = 0;
        int opcao = 0;

        while (true) {
            System.out.println("\nEntre um valor positivo maior que zero (0=fim):");
            valor = Integer.parseInt(s.nextLine());
            if (valor == 0) {
                break;
            }
            dados.add(valor);

            System.out.println("Deseja ativar algum visualizador? (1=Media, 2=Somatorio, 3=SomQuadrado, 0=Nao):");
            opcao = Integer.parseInt(s.nextLine());
            
            switch (opcao) {
                case 1:
                    dados.ativaObservadores(cm);
                    break;
                case 2:
                    dados.ativaObservadores(cs);
                    break;
                case 3:
                    dados.ativaObservadores(csq);
                    break;
                default:
                    System.out.println("Nenhum visualizador ativado.");
            }
        }

        s.close();
        System.out.println("Fim");
    }
    
}
