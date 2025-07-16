package FunctionsInJava;

import java.util.Scanner;

public class Simple {
    public static void main(String[] args) {
        sum();
        greeting();
    }

    static void sum() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int num1 = scanner.nextInt();
        System.out.println("Enter the second number:");
        int num2 = scanner.nextInt();

        int result = num1 + num2;
        scanner.close();
        System.out.println("The sum is: " + result);
    }
    static void greeting() {
        System.out.println("Hello, welcome to the Simple program!");
    }
}
