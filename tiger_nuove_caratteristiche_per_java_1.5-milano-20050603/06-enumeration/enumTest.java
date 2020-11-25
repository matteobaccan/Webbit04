
public class enumTest {

    public enum nomi { matteo, carlo, raffaele };

    public static final int matteo   = 0;
    public static final int carlo    = 1;
    public static final int raffaele = 2;


    public enum cognomi { rossi, bianchi, verdi;
       final static String qualcosa(){
          return "ciao";
       }
    };

    public enum nomieta { matteo(33), carlo(29), raffaele(55);
       private final int eta;
       nomieta( int v ){
          eta = v;
       }
       public int eta(){
          return eta;
       }
    };

    public static void main(String[] args) {
       System.out.println( nomi.matteo );
       System.out.println( carlo );

       System.out.println( cognomi.rossi );
       System.out.println( cognomi.qualcosa() );

       System.out.println( nomieta.matteo.eta() );
    }

}
