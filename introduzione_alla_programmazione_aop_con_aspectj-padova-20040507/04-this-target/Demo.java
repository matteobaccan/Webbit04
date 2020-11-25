public class Demo {
    public static void main(String[] args){
        Demo d = new Demo();
        d.go();
    }

    public Demo(){}

    public void go(){
        System.out.println( "ciao" );
        Demo2 d = new Demo2();
        d.go();
    }

}
