import java.util.*;

public class inputTest {

    public static void main(String[] args) {
       // Grazie a varargs
       // Output formattato
       System.out.printf("[%s] [%5d] [%5x]\n", "Matteo", 33, 2459);

       // Input formattato
       // BETA 1
       //Scanner s=Scanner.create(System.in);
       // BETA 2
       Scanner s= new Scanner(System.in);
       System.out.println( "Ciao come ti chiami? " );
       String str = s.next();
       System.out.println( "Quanti anni hai? " );
       int val    = s.nextInt();
       s.close();

       System.out.printf( "%s sei sicuro di avere %d anni?", str, val );

    }

}
