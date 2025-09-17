package Singleton.creation;

import java.io.Serializable;

public class LazySingleton {

    /* Key characteristics of Singleton
        1.private constructor--to prevent instantiation from outside
        2.static variable-- to hold the single instance
        3.static method--to return that instance
     */

    /* Lazy Singleton:
    To overcome the problem of Easy Singleton,
    Lazy came.Instance is created only when requested(lazy-loaded)
     */

    // static variable
    private static LazySingleton instanceObj;
    //private constructor
    private LazySingleton(){

    }
    //static method
    public static LazySingleton getInstance(){
        if(instanceObj==null){
            instanceObj=new LazySingleton();
        }
        return instanceObj;
    }



}

