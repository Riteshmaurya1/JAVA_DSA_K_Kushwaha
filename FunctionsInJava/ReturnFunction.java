package FunctionsInJava;

public class ReturnFunction {
    public static void main(String[] args) {
        int result = sum(5, 10);
        System.out.println("The sum is: " + result);
    }

    static int sum(int a, int b) {
        int result = a + b;
        return result;
    }
}
