public class App {
    public static void main(String[] args) throws Exception {
        LogSimples log = LogSimples.getInstance();
        LogSimples log2 = LogSimples.getInstance();

        log.log("Mensagem de alerta 1");
        log.log("Mensagem de alarme 23");
        log.log("Mensagem de PANICO!!");
        log2.log("Mensagem instancia");
        log2.log("Mensagem teste");
        log2.log("Mensagem aaa");
        log2.log("Mensagem bbb");


        for(String m:log){
            System.out.println(m);
        }
    }
}
