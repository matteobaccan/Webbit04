import java.lang.annotation.*;
import java.lang.reflect.*;

public @Retention(java.lang.annotation.RetentionPolicy.RUNTIME) @interface debug{
    boolean  devbuild() default false;
    int      counter();
    String   autore()   default "pincopallo";
}
