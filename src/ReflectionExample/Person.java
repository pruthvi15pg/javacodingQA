package ReflectionExample;

import Singleton.creation.LazySingleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Person {
    private String name;
    private int age;

    public Person() {
        this.name = "Unknown";
        this.age = 0;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    private void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

 class ReflectionExample {
    public static void main(String[] args) throws Exception {
        // Load the class dynamically
        Class<?> clazz = Class.forName("Person");

        // Get all constructors
        Constructor<?>[] constructors = clazz.getDeclaredConstructors();
        for (Constructor<?> c : constructors) {
            System.out.println("Constructor: " + c);
        }

        Constructor<LazySingleton> constructorss = LazySingleton.class.getDeclaredConstructor();
        constructorss.setAccessible(true);

        // Create object using constructor
        Constructor<?> constructor = clazz.getDeclaredConstructor(String.class, int.class);
        Object personObj = constructor.newInstance("Pruthvi", 25);

        // Access private field
        Field nameField = clazz.getDeclaredField("name");
        nameField.setAccessible(true);  // bypass private
        System.out.println("Old Name: " + nameField.get(personObj));
        nameField.set(personObj, "Updated Pruthvi");
        System.out.println("New Name: " + nameField.get(personObj));

        // Call private method
        Method method = clazz.getDeclaredMethod("displayInfo");
        method.setAccessible(true);
        method.invoke(personObj);
    }
}

