import java.util.*;

public class forTest2 {

    public static void main(String[] args) {
       Vector<String> c = new Vector<String>();

       c.add("uno");
       c.add("due");
       c.add("tre");

       // Old Style
       for( Enumeration e = c.elements(); e.hasMoreElements();  )
          System.out.println( e.nextElement() );

       // New Style
       for( String o : c )
          System.out.println( o );
    }

}
