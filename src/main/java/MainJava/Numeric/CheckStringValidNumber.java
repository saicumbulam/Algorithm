package MainJava.Numeric;

public class CheckStringValidNumber {
    public static Number process(String s) {
        if (s.matches("[+-]*\\d*\\.\\d+[dDeEfF]*")) {
            try {
                double dValue = Double.parseDouble(s);
                System.out.println("It's a double: " + dValue);
                return Double.valueOf(dValue);
            } catch (NumberFormatException e) {
                System.out.println("Invalid double: " + s);
                return Double.NaN;
            }
        } else // did not contain . d e or f, so try as int.
            try {
                int iValue = Integer.parseInt(s);
                System.out.println("It's an int: " + iValue);
                return Integer.valueOf(iValue);
            } catch (NumberFormatException e2) {
                System.out.println("Not a number: " + s);
                return Double.NaN;
            }
    }
}
