public class Overloading {
    public static void main(String[] args) {
        fun(64);
        fun("Ritesh Kumar");
    }

    static void fun(int a) {
        System.out.println("I am an integer function: " + a);
    }

    static void fun(String name) {
        System.out.println("I am a string function: " + name);
    }
}
