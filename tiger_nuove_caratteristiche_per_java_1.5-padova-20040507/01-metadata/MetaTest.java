import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(java.lang.annotation.RetentionPolicy.RUNTIME) @interface Copyright{
   String cpr() default "";
}

public class MetaTest {
    final boolean produzione=true;

    @debug(devbuild=produzione,counter=1,autore="matteo baccan") public void testMethod()  {

    }

    @Copyright(cpr="(c) matteo baccan") public void testMethod2()  {

    }

    public static void main(String[] args) {

        MetaTest mt = new MetaTest();
        try {
            System.out.println("TestMethod");
            debug da = MetaTest.class.getMethod("testMethod").getAnnotation( debug.class );
            System.out.println( da.autore() );

            System.out.println("TestMethod2");
            Copyright co = mt.getClass().getMethod("testMethod2").getAnnotation( Copyright.class );
            System.out.println( co.cpr() );

         } catch(NoSuchMethodException e) {
             System.out.println(e);
         }
     }
}
