package FunctionsInJava;

public class StringExample {
    public static void main(String[] args) {
        String message = greet();
        System.out.println(message);
    }

    static String greet() {
        String greeting = "Hello, World!";
        return greeting;
    }
}
