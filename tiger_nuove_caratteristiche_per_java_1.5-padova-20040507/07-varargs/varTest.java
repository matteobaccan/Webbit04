public class varTest {

    public static void main(String[] args) {
       varTest x = new varTest();
       x.testArg( "ciao", "io", "sono", "Matteo", 10, 20 );
    }


    void testArg(Object ... args) {
       for( Object s : args ) {
          System.out.println( s ); 
       }
    }

}
