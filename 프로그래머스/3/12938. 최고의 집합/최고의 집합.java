class Solution {
    public int[] solution(int n, int s) {
        int[] answer = new int[n];
        
        if(s / n == 0){
            return new int[]{-1};
        }
        else {
            int sub = s / n;
            int remain = s % n;
            
            for(int i =0 ; i < n; i++){
                if(i >= n - remain) {
                    answer[i] = sub + 1;
                } else {
                    answer[i] = sub;
                }
            }
        }
        
        return answer;
    }
}