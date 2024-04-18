class Solution {
    public int solution(int[] arr) {
        int answer = arr[0];
        
        for(int i = 1; i < arr.length; i++){
            int gcd = Gcd(answer, arr[i]);
            answer = answer * arr[i] / gcd;
        }
        
        return answer;
    }
    
    public int Gcd(int a, int b){
        int A = Math.max(a, b);
        int B = Math.min(a, b);
        
        while(A % B != 0){
            int R = A % B;
            A = B;
            B = R;
        }
        return B;
    }
}