package annotation;

import java.lang.annotation.Repeatable;

@Repeatable(Ntrstns.class)
public @interface Ntrstn {
    String value() default "";
}
