package MainJava.Strings;

public class StringTrim {
    public static void main(String[] args) {
        System.out.println("  Hello  ".strip()); // remove leading and trail whitespace removed
        System.out.println("Hello   ".stripLeading()); // remove leading and trail whitespace
        System.out.println("   Hello".stripTrailing()); // remove leading and trail whitespace
        System.out.println("Hello".trim()); // remove leading and trail space removed (defined by Character.isSpace())

    }
}
