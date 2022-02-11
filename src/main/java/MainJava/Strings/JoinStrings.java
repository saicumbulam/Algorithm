package MainJava.Strings;

import java.util.StringTokenizer;

public class JoinStrings {
    public static void main(String[] args) {
        String SAMPLE_STRING = "sample me";
        System.out.println(
                "Split using String.split; joined using 1.8 String join");
        System.out.println(String.join(", ", SAMPLE_STRING.split(" ")));

        System.out.println(
                "Split using StringTokenizer; joined using StringBuilder");
        StringTokenizer st = new StringTokenizer(SAMPLE_STRING);
        StringBuilder sb2 = new StringBuilder();
        while (st.hasMoreElements()) {
            sb2.append(st.nextToken());
            if (st.hasMoreElements()) {
                sb2.append(", ");
            }
        }
        System.out.println(sb2);
    }
}
