public class Validador{
    public static boolean validacao(Tipo tipo, String valor){
        if(tipo == Tipo.EMAIL){
            return new ValidaEmail().valida(valor);
        }
        else if (tipo == Tipo.MATRICULA){
            return new ValidaMatricula().valida(valor);
        }
        return new ValidaInteiro().valida(valor);
    }
}
