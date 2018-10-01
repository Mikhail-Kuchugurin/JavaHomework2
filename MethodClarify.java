package lesson2.task2;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)

public @interface MethodClarify {
    String message = "Does not matter turnOn or turnOff the appliance";
}
