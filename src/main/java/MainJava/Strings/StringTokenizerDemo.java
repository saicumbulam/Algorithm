package MainJava.Strings;

import java.util.StringTokenizer;

public class StringTokenizerDemo {
    public static void main(String[] args) {
        StringTokenizer st = new StringTokenizer("Hello World of Java");

        while (st.hasMoreTokens( ))
            System.out.println("Token: " + st.nextToken( ));


        // considering delimiter has tokens
        st =
                new StringTokenizer("Hello, World|of|Java", ", |", true);

        while (st.hasMoreElements( ))
            System.out.println("Token: " + st.nextElement( ));
    }

    public final static int MAXFIELDS = 5;
    public final static String DELIM = "|";

    /** Processes String and deal with null feilds, returns it as an array of Strings */
    public static String[] process(String line) {
        String[] results = new String[MAXFIELDS];

        // Unless you ask StringTokenizer to give you the tokens,
        // it silently discards multiple null tokens.
        StringTokenizer st = new StringTokenizer(line, DELIM, true);

        int i = 0;
        // Stuff each token into the current slot in the array.
        while (st.hasMoreTokens()) {
            String s = st.nextToken();
            if (s.equals(DELIM)) {
                if (i++>=MAXFIELDS)
                    // This is messy: See StrTokDemo4b which uses
                    // a List to allow any number of fields.
                    throw new IllegalArgumentException("Input line " +
                            line + " has too many fields");
                continue;
            }
            results[i] = s;
        }
        return results;
    }

    public static void printResults(String input, String[] outputs) {
        System.out.println("Input: " + input);
        for (String s : outputs)
            System.out.println("Output " + s + " was: " + s);
    }

    public static void Test(String[] a) {
        printResults("A|B|C|D", process("A|B|C|D"));
        printResults("A||C|D", process("A||C|D"));
        printResults("A|||D|E", process("A|||D|E"));
    }
}
