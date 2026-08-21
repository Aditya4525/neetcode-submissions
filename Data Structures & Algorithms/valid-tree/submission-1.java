class Solution {
    public boolean validTree(int n, int[][] edges) {
        if(edges.length!=n-1){
            return false;
        }
        List<List<Integer>> adj=new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<Integer>());
        }
        for(int[] edge:edges){
            adj.get(edge[0]).add(edge[1]);
            adj.get(edge[1]).add(edge[0]);
        }    
        Set<Integer> visited = new HashSet<>();
        if(!dfs(0,-1,adj,visited)){
            return false;
        }
        return visited.size()==n;
    }

    public boolean dfs(int node,int parent,List<List<Integer>> adj,Set<Integer> visited){
        List<Integer> neighbours=adj.get(node);
        visited.add(node);
        for(int nei:neighbours){
            if(nei==parent){
                continue;
            }
            if(visited.contains(nei)){
                return false;
            }
            if(!dfs(nei,node,adj,visited)){
                return false;
            }
        }
        return true;
    }
}
