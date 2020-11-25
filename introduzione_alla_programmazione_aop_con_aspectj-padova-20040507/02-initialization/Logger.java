aspect Logging {
     pointcut primo_metodo() : staticinitialization( Demo );

     void around(): primo_metodo() {
         System.out.println("Prima");
         proceed();
         System.out.println("Dopo");
     }

}
