import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        
        Stack<Character> stackStr = new Stack<>();
        
        if(s.length() >= 1){
            stackStr.push(s.charAt(0));
            
            for(int i = 1; i < s.length(); i++){
                char tmp = s.charAt(i);
                if(!stackStr.isEmpty() && stackStr.peek() == tmp){
                    stackStr.pop();
                } else stackStr.push(tmp);
            }
        } else return 0;
        
        return stackStr.isEmpty() ? 1 : 0;
    }
}