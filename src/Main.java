import Singleton.creation.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        EasySingleton conObj=EasySingleton.getInstance();
        System.out.println("conObj----"+conObj);
        /*
        if u try to create a new instance,it will throw --- EasySingleton class has private access
        EasySingleton s1=new EasySingleton();
        System.out.println(s1);
        */
        EasySingleton s1=EasySingleton.getInstance();
        System.out.println("s1----"+s1);
        EasySingleton s2=EasySingleton.getInstance();
        System.out.println("s2----"+s2);
        /*
        output:
        conObj----Singleton.creation.EasySingleton@2a84aee7
        s1----Singleton.creation.EasySingleton@2a84aee7
        s2----Singleton.creation.EasySingleton@2a84aee7
         */


        LazySingleton lazyObj=LazySingleton.getInstance();
        System.out.println("lazyObj----"+lazyObj);
        LazySingleton lazyObj2=LazySingleton.getInstance();
        System.out.println("lazyObj2----"+lazyObj2);

        /* output:
        lazyObj----Singleton.creation.LazySingleton@2a84aee7
        lazyObj2----Singleton.creation.LazySingleton@2a84aee7
        */


        SynchronizedSingleton sync1=SynchronizedSingleton.getInstance();
        SynchronizedSingleton sync2=SynchronizedSingleton.getInstance();
       // SynchronizedSingleton sync3=new SynchronizedSingleton();

        System.out.println("sync1---"+sync1);
        System.out.println("sync2---"+sync2);
        //System.out.println("sync3----"+sync3);

        /* output:
        sync1---Singleton.creation.SynchronizedSingleton@f6f4d33
        sync2---Singleton.creation.SynchronizedSingleton@f6f4d33
         */



        //Double Check lock
        DoubleCheckLocking doubleCheckLocking=DoubleCheckLocking.getInstance();
        System.out.println("doubleCheckLocking----"+doubleCheckLocking);
        DoubleCheckLocking doubleCheckLocking2=DoubleCheckLocking.getInstance();
        System.out.println("doubleCheckLocking2----"+doubleCheckLocking2);

        /* output:
        doubleCheckLocking----Singleton.creation.DoubleCheckLocking@3f99bd52
        doubleCheckLocking2----Singleton.creation.DoubleCheckLocking@3f99bd52
         */


        BillPughSingleton billPughSingleton=BillPughSingleton.getInstance();
        System.out.println("billPughSingleton----"+billPughSingleton);
        BillPughSingleton billPughSingleton2=BillPughSingleton.getInstance();
        System.out.println("billPughSingleton2----"+billPughSingleton2);

        /* output:
        billPughSingleton----Singleton.creation.BillPughSingleton@7adf9f5f
        billPughSingleton2----Singleton.creation.BillPughSingleton@7adf9f5f
         */



        EnumSingleton singleton1 = EnumSingleton.INSTANCE;
        EnumSingleton singleton2 = EnumSingleton.INSTANCE;

        singleton1.showMessage();

        System.out.println(singleton1 == singleton2); // true

    }
}