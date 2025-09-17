package Singleton.fixSingleton;

import Singleton.creation.LazySingleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;


public class FixLazyUsingReflection {
    /*
    1. Using Reflection
    Reflection can access the private constructor and create another instance.

    */
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        FixLazySingleton lazySingleton1 = FixLazySingleton.getInstance();
        Constructor<FixLazySingleton> constructor=FixLazySingleton.class.getDeclaredConstructor();
        constructor.setAccessible(true);

        FixLazySingleton lazySingleton2=constructor.newInstance();

        System.out.println("lazySingleton1 hashcode:"+lazySingleton1.hashCode());
        System.out.println("lazySingleton2 hashcode:"+lazySingleton2.hashCode());

    }

    /* output:
   when u run..u will get stacktrace.....That stack trace means you already applied the Reflection fix inside your Singleton constructor,
    and Reflection is now being blocked.
     */
}
