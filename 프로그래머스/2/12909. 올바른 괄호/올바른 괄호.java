import java.util.Stack;

class Solution {
    boolean solution(String s) {
        Stack<Character> stack = new Stack<>();
        
        for(int i = 0; i<s.length(); i++){
            char tmp = s.charAt(i);
            if(tmp == '('){
                stack.push(tmp);
            } else if(tmp == ')' && !stack.empty() && stack.peek() == '('){
                stack.pop();
            } else {
                return false;
            }
        }
        
        return stack.empty();
    }
}