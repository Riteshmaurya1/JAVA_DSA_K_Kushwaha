package FunctionsInJava;

import java.util.Scanner;

// package functions;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = in.next();
        String person = myGreet(name);
        System.out.println(person);
    }

    static String myGreet(String name) {
        String greeting = "Hello, " + name + "!";
        return greeting;
    }
}