package Singleton.creation;

public class SynchronizedSingleton {
    /*
    Problem
    A Singleton ensures only one instance of a class exists in the JVM.
    But in multithreaded environments, multiple threads may try to create the instance simultaneously → leading to multiple objects.

    Solution → Use synchronized
    By making the instance creation synchronized, we ensure only one thread can execute it at a time.
     */
    //static variable
    private static SynchronizedSingleton instance;

    //private constructor
    private SynchronizedSingleton(){}

    //static method
    synchronized public static SynchronizedSingleton getInstance(){
        if(instance==null){
            instance=new SynchronizedSingleton();
        }
        return instance;
    }

    public static void main(String[] args) {

    }

    /* output:
    s1---Singleton.creation.SynchronizedSingleton@2a84aee7
    s2---Singleton.creation.SynchronizedSingleton@2a84aee7
     */
}
