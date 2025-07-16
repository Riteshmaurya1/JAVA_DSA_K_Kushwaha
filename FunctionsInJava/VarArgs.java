
import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun(2, 4, 7, 10, 465, 14);
        str("Ritesh Maurya", "Kunal Kushwaha", "Sahil", "Rohit", "Aman", "Anshika", "Ankita");
        mix(2, 4, "Aditya", "Anurag");
    }

    static void fun(int... v) {
        System.out.println(Arrays.toString(v));
        v[0] = 51;
        System.out.println(Arrays.toString(v));
    }

    static void str(String... v) {
        System.out.println(v.length);
        for (String s : v) {
            System.out.print(s + ", ");
        }
    }

    static void mix(int a, int b, String... c) {
        System.out.println("\n Integer values: " + a + ", " + b);
        System.out.println("String values: " + Arrays.toString(c));
    }
}
