package Singleton.EnumBreakTest;

public class EnumCloneTest {
    public static void main(String[] args) {
        try {
            SingletonEnum s1 = SingletonEnum.INSTANCE;
            //when u run uncomment this
            //SingletonEnum s2 = (SingletonEnum) s1.clone();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
/* output: u cant break using clone
java: clone() has protected access in java.lang.Enum
 */
