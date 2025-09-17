package Singleton.EnumBreakTest;

import java.io.*;

public class EnumSerializationTest {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        SingletonEnum instance1=SingletonEnum.INSTANCE;

        //serialize
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("enum.obj"));
        oos.writeObject(instance1);
        oos.close();

        //deserilaize
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("enum.obj"));
        SingletonEnum instance2=(SingletonEnum) ois.readObject();
        System.out.println(instance1==instance2);
        System.out.println("instance1 hashcode:"+instance1.hashCode());
        System.out.println("instance2 hashcode:"+instance2.hashCode());
    }
}
/* output:u can't break Enum using Serialization
true
instance1 hashcode:186370029
instance2 hashcode:186370029
 */
