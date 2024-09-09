import java.util.Map;

public class Simples implements ICodificaEDecodifica {
    
    private Map<Character,Character> tabCod;
    private Map<Character,Character> tabDeCod;


    public Simples(){
        tabCod = TabCod.cod();
        tabDeCod = TabDecod.decode();
    }
    @Override
    public String codifica(String str) {
        char[] aux = str.toCharArray();
        char[] resp = new char[str.length()];
        for(int i=0;i<aux.length;i++){
            if (tabCod.containsKey(aux[i])){
                resp[i] = tabCod.get(aux[i]);
            }else{
                resp[i] = aux[i];
            }
        }
        return new String(resp);   
    }
    @Override
    public String decodifica(String str) {
        char[] aux = str.toCharArray();
        char[] resp = new char[str.length()];
        for(int i=0;i<aux.length;i++){
            if (tabDeCod.containsKey(aux[i])){
                resp[i] = tabDeCod.get(aux[i]);
            }else{
                resp[i] = aux[i];
            }
        }
        return(new String(resp));
    }    
}
