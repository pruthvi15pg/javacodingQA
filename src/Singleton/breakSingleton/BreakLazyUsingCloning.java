package Singleton.breakSingleton;

import Singleton.creation.LazySingleton;

public class BreakLazyUsingCloning {
    public static void main(String[] args) throws CloneNotSupportedException {

        Singleton s1 = Singleton.getInstance();
        Singleton s2 =(Singleton)s1.clone();
        System.out.println("s1 hashcode:"+s1.hashCode());
        System.out.println("s2 hashcode:"+s2.hashCode());



    }
}
/* output:
s1 hashcode:1595428806
s2 hashcode:2093176254
 */