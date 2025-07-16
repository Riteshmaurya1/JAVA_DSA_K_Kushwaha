package FunctionsInJava;
public class PassTheValue {
    public static void main(String[] args) {
        int ans = multi(10, 5);
        System.out.println("This is the return of int inside the main function =: " + ans);
    }

    static int multi(int a, int b) {
        int result = a * b;
        return result;
    }
}
