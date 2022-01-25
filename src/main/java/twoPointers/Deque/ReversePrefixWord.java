package twoPointers.Deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class ReversePrefixWord {
    public String reversePrefix(String word, char ch) {
        Deque<Character> deque = new ArrayDeque<>();
        boolean res = false;
        for (char c: word.toCharArray()) {
            if(!res)
            {
                deque.addFirst(c);
            }
            else
            {
                deque.addLast(c);
            }
            if(c == ch && !res) res = true;
        }
        if(!res) return word;
        return getStringfromQueue(deque);
    }

    private String getStringfromQueue(Deque<Character> deque) {
        StringBuilder sb = new StringBuilder();
        while (!deque.isEmpty())
        {
            sb.append(deque.removeFirst());
        }
        return sb.toString();
    }
}
