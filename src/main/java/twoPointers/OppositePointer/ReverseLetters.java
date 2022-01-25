package twoPointers.OppositePointer;

public class ReverseLetters {
    public String reverseOnlyLetters(String str) {
        if (str == null) return null;

        char[] arr = str.toCharArray();
        int left = 0;
        int right = arr.length-1;

        while(left < right)
        {
            while(left < right && !Character.isLetter(arr[left]))
            {
                left++;
            }

            while(left < right && !Character.isLetter(arr[right]))
            {
                right--;
            }

            if (left < right)
            {
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }

        return String.valueOf(arr);
    }
}
