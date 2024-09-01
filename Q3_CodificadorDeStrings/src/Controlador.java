
public class Controlador{
    public Controlador(){
    }    
    public static String codifica(ICodificaEDecodifica c, String str){
        return c.codifica(str);
    }
    public static String decodifica(ICodificaEDecodifica c, String str){
        return c.decodifica(str);
    }

}