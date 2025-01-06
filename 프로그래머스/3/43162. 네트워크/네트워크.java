class Solution {
    public int solution(int n, int[][] computers) {
        int answer = 0;
        boolean[] visited = new boolean[computers.length];
        
        for(int i=0; i<computers.length; i++){
            visited[i] = false;
        }
        
        for(int i=0; i<computers.length; i++){
            if(visited[i] == false) {
                answer++;
                dfs(i, computers, visited);
            }
        }
        
        return answer;
    }
    
    public void dfs(int x, int[][] num, boolean[] visited) {
        visited[x] = true;
        
        for(int i=0; i<num.length; i++){
            if(!visited[i] && num[x][i] == 1) {
                dfs(i, num, visited);
            }
        }
    }
}