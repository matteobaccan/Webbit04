public aspect Logger {

     declare parents : Demo extends java.util.Vector;

     void Demo.prova() {
         System.out.println("Prova");
     }
}
