import java.lang.management.*;
import java.util.*;
import javax.management.*;

public class MemTest {
    public static void main(String args[]) {
      List pools =ManagementFactory.getMemoryPoolMBeans();
      for(Object o : pools.toArray() ){
            MemoryPoolMBean p = (MemoryPoolMBean)o;
            System.out.println("Memory type="+p.getType()+" Memory usage="+p.getUsage());
        }
    }
}

