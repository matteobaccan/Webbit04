import java.util.*;

public class Freq {
    private static final Integer ONE = new Integer(1);
    public static void main(String[] args) {
        // Frequenza di stringhe
        Map m = new TreeMap();
        for (int i=0; i<args.length; i++) {
            Integer freq = (Integer) m.get(args[i]);
            m.put(args[i], freq==null ? ONE :
                  new Integer(freq.intValue() + 1));
        }
        System.out.println(m);
    }
}