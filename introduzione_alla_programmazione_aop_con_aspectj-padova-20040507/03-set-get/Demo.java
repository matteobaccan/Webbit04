public class Demo {
    public static void main(String[] args){
        Demo d = new Demo();
        d.go();
        d.cVal = "TEST2";
        System.out.println( d.cVal );
        d.cVal = "TEST3";
        System.out.println( d.cVal );

    }

    public static String cVal = "";
    static{
       cVal = "TEST";
       System.out.println( "static" );
    }

    public Demo(){}

    public String cVar = "";

    public void go(){
        metodo1( "PAR1" );
        System.out.println( "passo 100 a Metodo2 [" +metodo2( 100 ) +"]" );
    }

    public void metodo1( String cPar ){
        System.out.println( "Metodo1 chiamato con parametro stringa [" +cPar +"]");
    }

    public String metodo2( int n ){
        System.out.println( "Metodo2 chiamato con parametro numerico [" +n +"]");
        return "valore di ritorno*2 (" +(n*2) +")";
    }
}
