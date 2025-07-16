public class Scope {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        {
            x = 5; // Changing the value of x inside the block
            int z = 20;
            System.out.println("Inside block: x = " + x + ", y = " + y + ", z = " + z);
        }
        System.out.println("Outside block: x = " + x + ", y = " + y);
    }
}
