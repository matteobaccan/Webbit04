aspect Logging {
     pointcut primo_metodo(): execution( * *.go() ) && this(Demo2);

     void around(): primo_metodo() {
         System.out.println("Prima");
         proceed();
         System.out.println("Dopo");
     }



     pointcut primo_metodo2(): execution( * *.go() ) && target(Demo);

     void around(): primo_metodo2() {
         System.out.println("Prima2");
         proceed();
         System.out.println("Dopo2");
     }

}
