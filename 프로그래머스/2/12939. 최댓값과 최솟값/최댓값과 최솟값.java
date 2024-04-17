class Solution {
    public String solution(String s) {
        String answer = "";
        
        String num[] = s.split(" ");
        int min = Integer.parseInt(num[0]);
        int max = min;
        
        for(int i=1; i<num.length; i++){
            int tmp = Integer.parseInt(num[i]);
            min = (tmp < min) ? tmp : min;
            max = (tmp > min && tmp > max) ? tmp : max;
        }
        
        answer += String.valueOf(min) + " " + String.valueOf(max);
        
        return answer;
    }
}