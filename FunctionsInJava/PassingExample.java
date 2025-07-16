public class PassingExample {
    public static void main(String[] args) {
        String name = "Ritesh Kumar";
        changeName(name);
        System.out.println("Name after function call: " + name);
    }

    static String changeName(String naam) {
        naam = "Raghuvendra Pratap!";
        return naam;
        // Block Level variable naam is not changed outside this function
        // because strings are immutable in Java.
    }
}
