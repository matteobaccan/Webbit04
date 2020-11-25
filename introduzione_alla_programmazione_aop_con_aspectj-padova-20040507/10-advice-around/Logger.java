import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.reflect.CodeSignature;

// Definisco la classe aspect di nome Logger
aspect Logger {

   // Definisco il pointcut goCut che intercetta demo e il suo metodo go
   pointcut goCut(): cflow( this(Demo) && execution(void go()) );

   // Definisco il pointcut demoExecs che intercetta tutti i metodi
   pointcut demoExecs(): within(Demo) && execution(* *(..));

   // Credo un aggetto di tipo around che viene eseguito per tutti i metodi
   //Object around(): demoExecs() && !execution(* go()) && goCut() {
   Object around(): demoExecs() {
      System.out.println("Metodo invocato: " +
                         thisJoinPointStaticPart.getSignature().getDeclaringType().getName() +"." +
                         thisJoinPointStaticPart.getSignature().getName() );

      // Visualizza i parametri
      printParameters(thisJoinPoint);

      System.out.println("Esecuzione metodo:" );

      Object result = proceed();

      System.out.println("Valore di ritorno: " + result );

      return result;
   }

   static private void printParameters(JoinPoint jp) {
      System.out.println("Argomenti: " );

      Object[] args = jp.getArgs();
      String[] names = ((CodeSignature)jp.getSignature()).getParameterNames();
      Class[] types = ((CodeSignature)jp.getSignature()).getParameterTypes();

      System.out.println("\tNum\tNome\tTipo - Valore");
      for (int i = 0; i < args.length; i++) {
         System.out.println("\t" +i +"\t" +names[i] +"\t" +types[i].getName() +" - " +args[i]);
      }
   }
}
