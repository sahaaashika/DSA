class Solution {
    public int findCircleNum(int[][] isConnected) {
        boolean[] visited=new boolean[isConnected.length];
        int count=0;
        for(int i=0;i<isConnected.length;i++){
            if(!visited[i]){
        Queue <Integer> q=new LinkedList();

                bfs(visited, isConnected, i,q);
                count++;
            }
        }
        return count;
    }
    public void bfs(boolean[] visited, int[][] isConnected, int i,Queue <Integer> q){
        q.add(i);
        while(q.size()!=0){
            int x=q.remove();
        for(int j=0;j<isConnected.length;j++){
            if(isConnected[x][j]==1 && !visited[j]){
                visited[j]=true;
                q.add(j);

            }
        }
        }
        return;
    }

}