import java.util.*;

class Solution {
    public int[] solution(String[] operations) {
        int[] answer = new int[2];
        
        PriorityQueue<Integer> minPQ = new PriorityQueue<>();
        PriorityQueue<Integer> maxPQ = new PriorityQueue<>(Collections.reverseOrder());
        
        for (String op : operations) {
            if (op.startsWith("I")) {
                int num = Integer.parseInt(op.split(" ")[1]);
                minPQ.offer(num);
                maxPQ.offer(num);
            } else if (op.equals("D 1") && !maxPQ.isEmpty()) {
                int num = maxPQ.poll();
                minPQ.remove(num);
            } else if (op.equals("D -1") && !minPQ.isEmpty()) {
                int num = minPQ.poll();
                maxPQ.remove(num);
            }
        }
        
        if (minPQ.isEmpty() && maxPQ.isEmpty()) {
            return new int[]{0, 0};
        } else {
            answer[0] = maxPQ.poll();
            answer[1] = minPQ.poll();
        }
        
        return answer;
    }
}