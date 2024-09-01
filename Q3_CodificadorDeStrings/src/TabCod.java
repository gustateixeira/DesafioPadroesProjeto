import java.util.HashMap;
import java.util.Map;

public class TabCod{
    private static Map<Character,Character> tabCod;
    private TabCod(){
        tabCod = new HashMap<>();
        tabCod.put('a','@');
        tabCod.put('e','#');
        tabCod.put('i','!');
        tabCod.put('o','$');
        tabCod.put('u','%');
    }
    public static Map<Character, Character> cod(){
        new TabCod();
        return tabCod;
    }

}