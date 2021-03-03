package ru.zimina.casino;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) {

        Casino casino = new Casino();

        Method[] casinoGames = casino.getClass().getDeclaredMethods();

        for (Method casinoGame : casinoGames) {
            casinoGame.setAccessible(true);
            Annotation[] annotations = casinoGame.getAnnotations();

            for (Annotation annotation : annotations) {
                if (annotation instanceof GameMarker) {
                    try {
                        casinoGame.invoke(casino);
                    } catch (IllegalAccessException | InvocationTargetException e ) {
                        e.printStackTrace();
                    }
                }
            }
        }

    }
}
