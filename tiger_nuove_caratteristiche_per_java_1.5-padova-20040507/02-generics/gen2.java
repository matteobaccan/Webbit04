import java.util.*;

public class gen2<GEN> {

  GEN uno;
  GEN due;
  public static void main(String[] args) {
     gen2<Integer> myInt2 = new gen2<Integer>();
     myInt2.setUno( new Integer(10) );
     myInt2.setDue( new Integer(7) );
     System.out.println( myInt2.getUno()+myInt2.getDue() );
  }

  public void setUno( GEN arg ) {
     uno = arg;
  }
  public void setDue( GEN arg ) {
     due = arg;
  }
  public GEN getUno() {
     return uno;
  }
  public GEN getDue() {
     return due;
  }

}
