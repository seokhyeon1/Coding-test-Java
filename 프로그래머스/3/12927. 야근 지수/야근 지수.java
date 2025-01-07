import java.util.*;

class Solution {
    public long solution(int n, int[] works) {
        long answer = 0;
        
                PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for (int work : works) {
            pq.offer(work);
        }

        for (int i = 0; i < n; i++) {
            int large = pq.poll();

            if (large == 0)
                break;

            pq.offer(large > 0 ? large - 1 : large);
        }

        while (!pq.isEmpty()) {
            long poll = pq.poll();
            answer += poll * poll;
        }
        
        return answer;
    }
}