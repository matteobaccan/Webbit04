aspect Logging {

     after() throwing: call(* *.*()) {
         System.out.println("ERRORE");
     }

}
