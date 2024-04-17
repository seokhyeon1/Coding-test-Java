import java.util.*;

class Solution {
    public String solution(String s) {
        StringTokenizer st = new StringTokenizer(s, " ", true);
        StringBuilder sb = new StringBuilder();
        
        while(st.hasMoreTokens()){
            String token = st.nextToken();
            if(!token.equals(" ")){
                char tmp = token.charAt(0);
                token = Character.toUpperCase(tmp) + token.substring(1).toLowerCase();
            }
            sb.append(token);
        }
        
        String answer = sb.toString();
        return answer;
    }
}