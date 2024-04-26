import java.util.*;

class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        
        Arrays.sort(people);
        
        int tmp = 0;
        
        for(int i = people.length-1; i >= tmp; i--){
            if(people[i] + people[tmp] <= limit){
                answer++;
                tmp++;
            } else {
                answer++;
            }
        }
        
        return answer;
    }
}