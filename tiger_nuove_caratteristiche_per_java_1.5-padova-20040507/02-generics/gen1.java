import java.util.*;

public class gen1 {

  public static void main(String[] args) {
     List<Integer> myIntList = new LinkedList<Integer>();
     myIntList.add(new Integer(2));
     myIntList.add("String");
     Integer iValue1 = myIntList.get(0);
     Integer iValue2 = myIntList.get(1);
     System.out.println( "*"+iValue1.intValue()+"*" );
     System.out.println( "*"+iValue2.intValue()+"*" );
  }

/*
gen1.java:8: cannot find symbol
symbol  : method add(java.lang.String)
location: interface java.util.List<java.lang.Integer>
     myIntList.add("String");
              ^
1 error
*/

}
