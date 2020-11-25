import java.lang.management.*;
import java.util.*;
import javax.management.*;

public class MemTest {
    public static void main(String args[]) {
      // BETA 1
      //List pools =ManagementFactory.getMemoryPoolMBeans();
      //for(Object o : pools.toArray() ){
            //MemoryPoolMBean p = (MemoryPoolMBean)o;
            //System.out.println("Memory type="+p.getType()+" Memory usage="+p.getUsage());
        //}

      // BETA 2
      List pools =ManagementFactory.getMemoryPoolMXBeans();
      for(Object o : pools.toArray() ){
            MemoryPoolMXBean p = (MemoryPoolMXBean)o;
            System.out.println("Memory type="+p.getType()+" Memory usage="+p.getUsage());
        }
    }
}

