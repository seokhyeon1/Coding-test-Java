class Solution {
    public int solution(int n) {
        int answer = 0;
        int start = 1;

        while(true){
            int num = 0;
            for(int i = start; i <= n; i++){
                num += i;
                if(num == n){
                    answer++;
                    break;
                }
                else if(num > n) break;
            }
            if(start == n) break;
            start++;
        }

        return answer;
    }
}