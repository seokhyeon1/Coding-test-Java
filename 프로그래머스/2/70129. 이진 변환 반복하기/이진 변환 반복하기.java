class Solution {
    public int[] solution(String s) {
        int[] answer = {0, 0};
        int zero = 0;
        
        while(true){
            zero += zeroCount(s, '0');
            answer[0]++;
            
            s = s.replace("0", "");
            int tmp = s.length();
            s = change(tmp);
            if(s.equals("1")){
                answer[1] = zero;
                break;
            }
        }
        
        return answer;
    }
    
    public static int zeroCount(String str, char ch){
        return str.length() - str.replace(String.valueOf(ch), "").length();
    }
    
    public static String change(int num){
        return Integer.toBinaryString(num);
    }
}