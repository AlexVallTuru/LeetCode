//package ValidParentheses;

import java.util.Stack;

public class validParentheses {

    public static void main(String[] args) {

        System.out.println(isValid("()"));

    }

    public static boolean isValid(String s) {

        Stack<Character> packrentesis = new Stack<>();

        for (char c : s.toCharArray()) {

            if (c == '(' || c == '[' || c == '{') {
                packrentesis.push(c);
            } else {
                if (packrentesis.isEmpty())
                    return false;

                char popped = packrentesis.pop();
                if (c == ')' && popped != '(')
                    return false;
                if (c == ']' && popped != '[')
                    return false;
                if (c == '}' && popped != '{')
                    return false;
            }

        }
        return packrentesis.isEmpty();
    }
}
