aspect Logging {
     pointcut primo_metodo() : call( void Demo.metodo1(String));
     pointcut primo_metodo2(): execution( String Demo.metodo2(int));

     void around(): primo_metodo() {
         System.out.println("Prima");
         proceed();
         System.out.println("Dopo");
     }
     String around(): primo_metodo2() {
         System.out.println("Prima2");
         String cRet = proceed();
         System.out.println("Dopo2");
         return cRet;
     }
}
