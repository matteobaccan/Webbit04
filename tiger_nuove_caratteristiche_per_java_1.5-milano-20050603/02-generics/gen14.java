import java.util.*;

public class gen14{

  public static void main(String[] args) {
     List myIntList = new LinkedList();
     myIntList.add(new Integer(2));
     myIntList.add("String");
     Integer iValue1 = (Integer)myIntList.get(0);
     Integer iValue2 = (Integer)myIntList.get(1);
     System.out.println( "*"+iValue1.intValue()+"*" );
     System.out.println( "*"+iValue2.intValue()+"*" );
  }

/*
Exception in thread "main" java.lang.ClassCastException: java.lang.String
        at gen14.main(gen14.java:10)
*/

}
