aspect Logging {
     pointcut primo_metodo(): call( void Demo.metodo1(String));

     after(): primo_metodo() {
         System.out.println("Qualcuno ha chiamato il metodo 1");
     }
}
