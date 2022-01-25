package twoPointers.OppositePointer;

import java.util.HashSet;

public class ReverseVowelsString {
    public String reverseVowels(String s) {
        char[] arr = s.toCharArray();

        int left = 0;
        int right = arr.length-1;
        HashSet<Character> set = new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        set.add('A');
        set.add('E');
        set.add('I');
        set.add('O');
        set.add('U');

        while(left < right)
        {
            while(left < right && !set.contains(arr[left]))
            {
                left++;
            }

            while(left < right && !set.contains(arr[right]))
            {
                right--;
            }

            if (left < right)
            {
                char tmp = arr[left];
                arr[left] = arr[right];
                arr[right] = tmp;
                left++;
                right--;
            }
        }

        return String.valueOf(arr);
    }
}
