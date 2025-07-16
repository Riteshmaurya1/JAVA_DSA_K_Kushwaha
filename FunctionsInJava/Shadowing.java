public class Shadowing {
    static int x = 20;

    public static void main(String[] args) {
        System.out.println("Value of x in main method: " + x);
        int x = 10; // Changing the value of x in the main method
        System.out.println("Value of x in main method: " + x);
    }
}
