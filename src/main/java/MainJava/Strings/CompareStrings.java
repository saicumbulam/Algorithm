package MainJava.Strings;

public class CompareStrings {
    public static void main(String[] args)
    {//Compare to a String
        String str_Sample = "RockStar";
        System.out.println("Compare To 'ROCKSTAR': " + str_Sample.compareTo("rockstar"));
        //Compare to - Ignore case
        System.out.println("Compare To 'ROCKSTAR' - Case Ignored: " + str_Sample.compareToIgnoreCase("ROCKSTAR"));

        //best performance
        boolean result = "hello".equals("hello");
        result = "hello".equalsIgnoreCase("hello");

    }
}
