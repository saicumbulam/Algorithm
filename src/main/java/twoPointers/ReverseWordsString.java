package twoPointers;

import java.util.Stack;

public class ReverseWordsString {
    public String reverseWords(String s) {
        StringBuilder str = new StringBuilder();
        Stack<String> stack = new Stack<>();
        int i = 0;

        while(i < s.length())
        {
            StringBuilder word = new StringBuilder();
            while(i < s.length() && s.charAt(i) != ' ')
            {
                word.append(s.charAt(i));
                i++;
            }

            if(word.length() > 0)
            {
                stack.add(word.toString());
            }
            i++;
        }


        while(!stack.isEmpty()){
            str.append(stack.pop()).append(" ");
        }
        return str.deleteCharAt(str.length()-1).toString();
    }
}
