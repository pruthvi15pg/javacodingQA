package Singleton.breakSingleton;

import Singleton.creation.LazySingleton;

import java.io.*;

public class BreakLazyUsingSerialization {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Singleton s1 = Singleton.getInstance();
        //serialize
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Singleton.obj"));
        oos.writeObject(s1);
        oos.close();

        //deserilaize
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Singleton.obj"));
        Singleton s2=(Singleton) ois.readObject();
        System.out.println("s1 hashcode:"+s1.hashCode());
        System.out.println("s2 hashcode:"+s2.hashCode());
    }

    /* output:
    s1 hashcode:485815673
    s2 hashcode:1174290147
     */
}
