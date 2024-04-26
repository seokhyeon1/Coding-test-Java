import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        int t = 2;
        int r = 1;
        String str = words[0];
        
        List<String> check = new ArrayList<>();
        check.add(str);
        
        for(int i = 1; i < words.length; i++){
            String word = words[i];
            
            if(word.length() <= 1)
                break;
            else if(check.contains(word))
                break;
            else if(str.charAt(str.length()-1) != word.charAt(0))
                break;
            
            t++;
            str = word;
            check.add(str);
            
            if(t > n){
                t = 1;
                r++;
            }
            
            if(i == words.length-1){
                t = 0;
                r = 0;
            }
        }
        
        answer[0] = t;
        answer[1] = r;

        return answer;
    }
}