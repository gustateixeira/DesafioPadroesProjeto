import java.util.HashMap;
import java.util.Map;

public class TabDecod {
    
    private static Map<Character, Character> tabDeCod;
    private TabDecod(){
        tabDeCod = new HashMap<>();
        tabDeCod.put('@','a');
        tabDeCod.put('#','e');
        tabDeCod.put('!','i');
        tabDeCod.put('$','o');
        tabDeCod.put('%','u');
    }
    public static Map<Character, Character> decode(){
        new TabDecod();
        return tabDeCod;
    }
}
