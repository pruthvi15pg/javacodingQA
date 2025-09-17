package Singleton.fixSingleton;

import Singleton.breakSingleton.Singleton;

public class FixLazyUsingCloning {
    public static void main(String[] args) throws CloneNotSupportedException {

        try {
            FixLazySingleton s1 = FixLazySingleton.getInstance();
            FixLazySingleton s2 = (FixLazySingleton) s1.clone(); // Exception thrown
        } catch (CloneNotSupportedException e) {
            System.out.println(e.getMessage()); // Singleton, cannot be cloned
        }
    }



}
/* output:
Singleton can't be cloned
 */