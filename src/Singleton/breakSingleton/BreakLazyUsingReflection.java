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
        Singleton Singleton1 = Singleton.getInstance();
        Constructor<Singleton> constructor=Singleton.class.getDeclaredConstructor();
        constructor.setAccessible(true);

        Singleton Singleton2=constructor.newInstance();

        System.out.println("Singleton1 hashcode:"+Singleton1.hashCode());
        System.out.println("Singleton2 hashcode:"+Singleton2.hashCode());

    }

    /* output:
    Singleton1 hashcode:1595428806
    Singleton2 hashcode:2093176254
     */
}
