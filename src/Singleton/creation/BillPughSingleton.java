package Singleton.creation;

public class BillPughSingleton {
    /*
   Problem:
    We need a Singleton (only one instance of a class should exist).
    In a multithreaded environment, we must ensure:
        Lazy initialization → Instance created only when needed.
        Thread safety → Only one instance, even with concurrent calls.
        Performance → Avoid unnecessary synchronization overhead.

  Older approaches had issues:
    Eager initialization → Creates the instance even if it’s never used (wastes memory).
    Synchronized method → Thread-safe but slow (every call locks).
    Double-Checked Locking → Works, but code is more complex and requires volatile.

Solution → Bill Pugh Singleton

1.Use a static inner class to hold the instance.
2.JVM ensures that the inner class is loaded only once, when it’s first accessed.
3.Class loading is thread-safe, so no explicit synchronization is needed.
4.This gives lazy initialization + thread safety + high performance.
     */
    private BillPughSingleton() {}
    //inner class
    private static class SingletonHelper{
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }
    public static BillPughSingleton getInstance(){
        return SingletonHelper.INSTANCE;
    }
}
