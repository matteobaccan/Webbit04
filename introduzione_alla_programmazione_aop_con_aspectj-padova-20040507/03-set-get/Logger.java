aspect Logging {
     pointcut primo_metodo() : set( String Demo.cVal );
     pointcut primo_metodo2() : get( String Demo.cVal );

     void around(): primo_metodo() {
         System.out.println("Prima set");
         proceed();
         System.out.println("Dopo set");
     }
     String around(): primo_metodo2() {
         String c;
         System.out.println("Prima get");
         c = proceed();
         System.out.println("Dopo get");
         return c;
     }

}
