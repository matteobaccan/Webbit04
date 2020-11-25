public aspect Logger {

     declare warning : call( * *.go() ) : "Possibile errore hai chiamato go";

     declare error : call( * *.go2() ) : "Non puoi chiamare go2";

}
