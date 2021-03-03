package ru.zimina.casino;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD) // к чему прикрепляем
@Retention(RetentionPolicy.RUNTIME) //
public @interface GameMarker {
}
