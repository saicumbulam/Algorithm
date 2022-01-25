package twoPointers.Deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class ReverseWordsStringIII {
    public static void main(String[] args) {
        String str = "Let's take LeetCode contest";
        System.out.println(reverseWords(str));
    }
    public static String reverseWords(String s) {
        String[] arr = s.split("\\s");
        Deque<String> deque = new ArrayDeque<>();
        addlastQueue(arr, deque);
        return removeFirstQueue(deque);
    }

    private static void addlastQueue(String[] arr, Deque<String> deque) {
        for (String str: arr) {
            StringBuilder sb = new StringBuilder(str).reverse();
            deque.addLast(sb.toString());
        }
    }

    private static String removeFirstQueue(Deque<String> deque) {
        StringBuilder sb = new StringBuilder();
        while (!deque.isEmpty())
        {
            sb.append(deque.removeFirst());
            sb.append(" ");
        }
        return sb.deleteCharAt(sb.length()-1).toString();
    }
}
