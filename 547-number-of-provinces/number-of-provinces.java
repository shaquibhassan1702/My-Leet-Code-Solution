class Solution {
    private void dfs(int[][] isconnected,boolean[]visited,int index){
        visited [index]=true;
        for(int j=0; j<isconnected.length; j++){
            if(isconnected[index][j]==1&& !visited[j]){

            
            dfs(isconnected,visited,j);
        }
    }

    }







    public int findCircleNum(int[][] isConnected) {
        int n=isConnected.length;
        boolean[]visited=new boolean [n];
      int count=0;
        
        for(int i=0; i<n; i++){
            if(!visited[i]){
                dfs(isConnected,visited,i);
                count ++;
            }
        }
        return count;
    }

}