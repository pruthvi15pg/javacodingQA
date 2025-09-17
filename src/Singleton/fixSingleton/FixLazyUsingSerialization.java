package Singleton.fixSingleton;

import Singleton.creation.LazySingleton;

import java.io.*;

public class FixLazyUsingSerialization {
    public static void main(String[] args) throws IOException, ClassNotFoundException {




        FixLazySingleton s1 = FixLazySingleton.getInstance();

        // Serialize
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("LazySingleton.obj"));
        oos.writeObject(s1);
        oos.close();

        // Deserialize
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("LazySingleton.obj"));
        FixLazySingleton s2 = (FixLazySingleton) ois.readObject();

        System.out.println("s1 hashcode: " + s1.hashCode());
        System.out.println("s2 hashcode: " + s2.hashCode());
    }

    /* output:
    s1 hashcode: 485815673
    s2 hashcode: 485815673
     */
}
