package Singleton.EnumBreakTest;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class EnumReflectionBreakTest {
    public static void main(String[] args) throws InvocationTargetException, InstantiationException, IllegalAccessException {
        Constructor<?>[] constructors=SingletonEnum.class.getDeclaredConstructors();

        for(Constructor<?> constructor:constructors){
            constructor.setAccessible(true);
            Object obj=constructor.newInstance();
        }

    }
    /* output: u cant break enum using reflection
    Exception in thread "main" java.lang.IllegalArgumentException: Cannot reflectively create enum objects
	at java.base/java.lang.reflect.Constructor.acquireConstructorAccessor(Constructor.java:547)
	at java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:499)
	at java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:486)
	at Singleton.EnumBreak.EnumReflectionBreakTest.main(EnumReflectionBreakTest.java:12)
     */

}
