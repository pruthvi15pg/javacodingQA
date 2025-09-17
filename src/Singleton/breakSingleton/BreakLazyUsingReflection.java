package Singleton.breakSingleton;

import Singleton.creation.LazySingleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;


public class BreakLazyUsingReflection {
    /*
    1. Using Reflection
    Reflection can access the private constructor and create another instance.

    */
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        LazySingleton lazySingleton1 = LazySingleton.getInstance();
        Constructor<LazySingleton> constructor=LazySingleton.class.getDeclaredConstructor();
        constructor.setAccessible(true);

        LazySingleton lazySingleton2=constructor.newInstance();

        System.out.println("lazySingleton1 hashcode:"+lazySingleton1.hashCode());
        System.out.println("lazySingleton2 hashcode:"+lazySingleton2.hashCode());

    }

    /* output:
    lazySingleton1 hashcode:1595428806
    lazySingleton2 hashcode:2093176254
     */
}
