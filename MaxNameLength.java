package lesson2.task2;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)

public @interface MaxNameLength {
        int maxNameLength = 24;

}
