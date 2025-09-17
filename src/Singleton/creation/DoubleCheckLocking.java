package Singleton.creation;

public class DoubleCheckLocking {

    /*
    🔹 Problem

A singleton ensures only one instance of a class exists.
But in a multithreaded environment, if two threads call getInstance() at the same time,
multiple objects can be created unless properly synchronized.
Solution:
Double-Checked Locking Singleton is a design pattern used to create a singleton object in a multithreaded environment.
It reduces the overhead of synchronization by checking twice if the instance is already created:

First check (without synchronization):
To avoid locking once the instance is initialized.

Second check (inside synchronized block):
Ensures only one thread creates the instance when it’s null.

This technique balances performance (avoiding unnecessary synchronization after initialization) and thread safety (only one instance is created even in concurrent scenarios).
*/
    private static volatile DoubleCheckLocking instance;
    private DoubleCheckLocking(){}
    public static DoubleCheckLocking getInstance(){
        if(instance==null){ //check1
            synchronized (DoubleCheckLocking.class){
                if(instance==null){ //check2
                    instance = new DoubleCheckLocking();
                }
            }
        }
        return instance;
    }



}
