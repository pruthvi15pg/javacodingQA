package Singleton.creation;

public enum EnumSingleton {
    /*
   Problem:
Traditional Singleton implementations (synchronized, double-checked locking, Bill Pugh) solve thread safety and lazy loading, but they still need careful coding.
They can be broken by:
    Serialization (creates a new instance unless handled properly).
    Reflection (can call private constructors).
We need a singleton that’s immune to these issues.

Solution → Enum Singleton
In Java, Enums are inherently thread-safe and provide serialization safety for free.
The JVM guarantees that any Enum value is instantiated only once

🔹 Why It’s the Best

✔ Thread-safe → Handled by JVM.
✔ Serialization-safe → Enum guarantees a single instance.
✔ Reflection-safe → Reflection cannot instantiate enums.
✔ Simplest code → Just INSTANCE.

*/



        INSTANCE;  // the only instance

        // You can add methods here
        public void showMessage() {
            System.out.println("Hello from Enum Singleton!");
        }
    }

