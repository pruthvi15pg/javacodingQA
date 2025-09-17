package Singleton.breakSingleton;

import Singleton.creation.LazySingleton;

import java.io.Serializable;

//singleton---to break lazy singleton add Serializable,Cloneable with override method
public class Singleton implements Serializable,Cloneable{
    // static variable
    private static Singleton instanceObj;
    //private constructor
    private Singleton(){

    }
    //static method
    public static Singleton getInstance(){
        if(instanceObj==null){
            instanceObj=new Singleton();
        }
        return instanceObj;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
