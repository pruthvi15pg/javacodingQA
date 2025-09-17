package Singleton.creation;

public class EasySingleton {
    /* Key characteristics of Singleton
        1.private constructor--to prevent instantiation from outside
        2.static variable-- to hold the single instance
        3.static method--to return that instance
     */


    /*
    Easy Initialization:
    Instance is created when class is loaded even if its never used
    */

    //create the obj--static variable
    private static EasySingleton instanceObj=new EasySingleton();

    //private constructor
    private EasySingleton(){

    }
    //static method
    public static EasySingleton getInstance(){
        return instanceObj;
    }

    public static void main(String[] args) {



    }

}
