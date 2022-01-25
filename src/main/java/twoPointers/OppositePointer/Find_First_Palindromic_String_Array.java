package twoPointers.OppositePointer;

public class Find_First_Palindromic_String_Array {
    public String firstPalindrome(String[] words) {
        for (String word : words) {
            boolean res = PalindromeCheck(word);
            if (res) {
                return word;
            }
        }
        return "";
    }

    private boolean PalindromeCheck(String word) {
        int left = 0;
        int right = word.length() - 1;

        while (left < right) {
            if (word.charAt(left) != word.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }
        return true;
    }
}
