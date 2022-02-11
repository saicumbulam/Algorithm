package Array.TwoPointer;

import java.util.HashSet;

public class StrobogrammaticNumber {
    public boolean isStrobogrammatic(String num) {
        HashSet<String> set = new HashSet<>();
        set.add("00");
        set.add("6");
        set.add("9");
        set.add("8");
        set.add("1");
        set.add("11");
        set.add("69");
        set.add("96");
        set.add("88");

        int left = 0;
        int right = num.length()-1;

        while(left <= right)
        {
            String item = String.valueOf(num.charAt(left)) +
                    String.valueOf(num.charAt(right));

            if (!set.contains(item)) return false;
            left++;
            right--;
        }

        return true;
    }
}
