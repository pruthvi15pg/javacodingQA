package Singleton.fixSingleton;

import java.io.Serializable;
//singleton for fixing-serializable,clonaeble,reflection
public class FixLazySingleton implements Serializable,Cloneable {
    // static variable
    private static FixLazySingleton instanceObj;

    //to fix reflection modify constructor
    private static boolean instanceCreated = false;
    //private constructor
    private FixLazySingleton(){
        if(instanceCreated){
            throw new RuntimeException("use getInstance() to create Singleton");
        }
        instanceCreated = true;
    }
    //static method
    public static FixLazySingleton getInstance(){
        if(instanceObj==null){
            instanceObj=new FixLazySingleton();
        }
        return instanceObj;
    }

    //to fix serialization--- add readResolve()
    protected Object readResolve(){
        return instanceObj;
    }

    //to fix cloning----override clone
    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("Singleton can't be cloned");
    }

}
