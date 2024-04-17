class Solution {
    public int solution(int n) {
        int answer = n + 1;
        
        String binaryString = Integer.toBinaryString(n);
        int count = oneCount(binaryString, '1');
        
        while(true){
            binaryString = Integer.toBinaryString(answer);
            int check = oneCount(binaryString, '1');
            
            if(check == count) break;
            
            else answer++;
        }
        
        
        return answer;
    }
    
    public static int oneCount(String str, char ch){
        return str.length() - str.replace(String.valueOf(ch), "").length();
    }
}