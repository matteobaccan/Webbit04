import java.util.*;

public class Freq3 {

    public static void main(String[] args) {
        // Frequenza di stringhe
        Map<String,Integer> m = new TreeMap<String,Integer>();
        for (String word : args) {
            Integer freq = m.get(word);
            m.put(word, freq==null ? 1 : freq+1 );
        }
        System.out.println(m);
    }
}
