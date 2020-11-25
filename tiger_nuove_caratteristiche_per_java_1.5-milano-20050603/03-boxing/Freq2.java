import java.util.*;

public class Freq2 {
    private static final Integer ONE = new Integer(1);
    public static void main(String[] args) {
        // Frequenza di stringhe
        Map m = new TreeMap();
        for (int i=0; i<args.length; i++) {
            Integer freq = (Integer) m.get(args[i]);
            m.put(args[i], freq==null ? ONE : freq+1 );
        }
        System.out.println(m);
    }
}