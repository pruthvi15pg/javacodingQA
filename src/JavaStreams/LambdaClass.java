package JavaStreams;

public class LambdaClass implements FI {

    @Override
    public void m1(int x) {
        System.out.println("from class Lambda");
    }

    public static void main(String[] args) {
        FI f=(x)-> System.out.println("from Interface"+x);
        f.m1(2);
    }
}
@FunctionalInterface
interface FI{
    void m1(int x);
}