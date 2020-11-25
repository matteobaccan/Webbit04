aspect Logging {
     pointcut primo_metodo(): call( void Demo.metodo1(String));

     void around(): primo_metodo() {
         System.out.println("Prima");
         proceed();
         System.out.println("Dopo");
     }
}
