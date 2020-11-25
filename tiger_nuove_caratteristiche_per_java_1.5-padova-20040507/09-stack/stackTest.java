import java.lang.management.*;
import java.util.*;
import javax.management.*;

public class stackTest {
    public static void main(String args[]) {
       StackTraceElement e[]=Thread.currentThread().getStackTrace();
       for (int i=0; i <e.length; i++) {
            System.out.println(e[i]);
           }
       System.out.println("\n"+Thread.getAllStackTraces());
    }
}

