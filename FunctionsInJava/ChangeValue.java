
import java.util.Arrays;

public class ChangeValue {
    public static void main(String[] args) {
        // Create an Array
        int[] arr = { 1, 2, 3, 4, 5 };
        changeArray(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void changeArray(int[] array) {
        // Change the first element of the array
        array[0] = 10;
        // This change will reflect outside this function
        // because arrays are mutable in Java.
    }
}
