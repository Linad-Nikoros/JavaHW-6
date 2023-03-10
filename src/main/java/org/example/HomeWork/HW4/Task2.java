//Given a string s containing just the characters '(', ')', '{', '}', '[' and ']',
// determine if the input string is valid.

package org.example.HomeWork.HW4;

import java.util.Stack;

public class Task2 {

    public static void main(String[] args) {
        String[] arrStrings = new String[]{"()[]{}", "([()]", "{[]}","(]" };
        for(String str : arrStrings) {
            System.out.println(str +  "=" + isValid(str));
        }
    }
    public static boolean isValid(String s) {
        Stack<Character> stackBracket = new Stack<Character>();
        for (char bracket : s.toCharArray()) {
            if (bracket == '(')
                stackBracket.push(')');
            else if (bracket == '{')
                stackBracket.push('}');
            else if (bracket == '[')
                stackBracket.push(']');
            else if ( stackBracket.pop() != bracket)
                return false;
        }
        return stackBracket.isEmpty();
    }
}
