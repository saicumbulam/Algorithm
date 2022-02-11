package MainJava.Strings;

public class ProcessStringsOneChar {
    public static void main(String[] args) {
        String mesg = "Hello world";

        System.out.println("Using toCharArray:");
        for (char ch : mesg.toCharArray()) {
            System.out.println(ch);
        }

        System.out.println("Using Streams:");
        mesg.chars().forEach(c -> System.out.println((char)c));
    }
}
