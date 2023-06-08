/*
@id         20
@title      Valid Parentheses
@tag        Stack
@author     CryoVit
@date       2023/06/08
*/

class Solution {
    public boolean isValid(String s) {
        Stack<Integer> stack = new Stack<Integer>();
        for (int i = 0; i < s.length(); i++) {
            switch(s.charAt(i)) {
                case '(':
                    stack.push(0);
                    break;
                case '[':
                    stack.push(1);
                    break;
                case '{':
                    stack.push(2);
                    break;
                case ')':
                    if (stack.empty() || stack.pop() != 0) {
                        return false;
                    }
                    break;
                case ']':
                    if (stack.empty() || stack.pop() != 1) {
                        return false;
                    }
                    break;
                case '}':
                    if (stack.empty() || stack.pop() != 2) {
                        return false;
                    }
                    break;
            }
        }
        return stack.empty();
    }
}

// simplified version
class Solution2 {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        for (char c: s.toCharArray()) {
            switch(c) {
                case '(':
                    stack.push(')');
                    break;
                case '[':
                    stack.push(']');
                    break;
                case '{':
                    stack.push('}');
                    break;
                default:
                    if (stack.empty() || stack.pop() != c) {
                        return false;
                    }
            }
        }
        return stack.empty();
    }
}
