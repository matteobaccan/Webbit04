public class Demo {
    public static void main(String[] args){
        Demo d = new Demo();
        d.go();
        d.go2();
    }

    public Demo(){}

    public void go(){
        System.out.println( "Ciao" );
    }
    public void go2(){
        System.out.println( "Ciao2" );
    }

}
