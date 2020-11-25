aspect Logging {
     pointcut primo_metodo() : execution( void *.*(*) ) && args( String );
     pointcut primo_metodo2() : execution( int Demo.*(*) ) && if( System.currentTimeMillis() > 10 );

     void around(): primo_metodo() {
         System.out.println(""+System.currentTimeMillis());
         System.out.println("Prima");
         proceed();
         System.out.println("Dopo");
     }

     int around(): primo_metodo2() {
         int i;
         System.out.println("Prima int");
         i=proceed();
         System.out.println("Dopo int");
         return i;
     }

}
