public class App {
    public static void main(String[] args) throws Exception {
        var tipo = Tipo.EMAIL;
        String email = "bernardo.copstein@pucrs.br";

        if (Validador.validacao(tipo, email)){
            System.out.println(email+" é um email válido!");
        }else{
            System.out.println(email+" não é um email válido!");
        }
    }
}
