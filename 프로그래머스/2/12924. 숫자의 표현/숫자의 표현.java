class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) answer++;
        }
        
        return n / 2 == 0 ? answer - 1 : answer;
    }
}