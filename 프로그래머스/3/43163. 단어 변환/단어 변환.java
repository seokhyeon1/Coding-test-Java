import java.util.*;

class Solution {
    public int solution(String begin, String target, String[] words) {
        int answer = 0;
        boolean ck = false;
        
        for (String word : words) {
            if (word.equals(target)) {
                ck = true;
                break;
            }
        }

        if (!ck) {
            return 0;
        }

        Queue<String> queue = new LinkedList<>();
        Queue<Integer> steps = new LinkedList<>();
        queue.offer(begin);
        steps.offer(0);

        boolean[] visited = new boolean[words.length];
        while (!queue.isEmpty()) {
            String current = queue.poll();
            int currentSteps = steps.poll();

            if (current.equals(target)) {
                answer = currentSteps;
                break;
            }

            for (int i = 0; i < words.length; i++) {
                if (!visited[i] && canTransform(current, words[i])) {
                    visited[i] = true;
                    queue.offer(words[i]);
                    steps.offer(currentSteps + 1);
                }
            }
        }
        
        return answer;
    }
    
    
    private static boolean canTransform(String word1, String word2) {
        int diffCount = 0;
        for (int i = 0; i < word1.length(); i++) {
            if (word1.charAt(i) != word2.charAt(i)) {
                diffCount++;
            }
        }
        return diffCount == 1;
    }
}