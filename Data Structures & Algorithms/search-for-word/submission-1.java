class Solution {
    private Set<Pair<Integer, Integer>> visited = new HashSet<>();
    private int ROWS, COLS;
    public boolean exist(char[][] board, String word) {
        ROWS = board.length;
        COLS = board[0].length;
        char[] chars = word.toCharArray();
        for(int i=0;i<board.length;i++){
            for (int j=0;j<board[i].length;j++){
                if(dfs(i,j,0,board,chars)){
                    return true;
                }
            }
        }
        return false;
    }

    public boolean dfs(int r, int c,int index,char[][] board,char[] chars){
        if(index==chars.length){
            return true;
        }
        if(r<0 || r>=ROWS ||c<0 || c>=COLS|| chars[index] !=board[r][c] || visited.contains(new Pair(r,c))){
            return false;
        }
        visited.add(new Pair(r,c));
        boolean result=dfs(r,c+1,index+1,board,chars) || dfs(r,c-1,index+1,board,chars) || dfs(r+1,c,index+1,board,chars) || dfs(r-1,c,index+1,board,chars);
      visited.remove(new Pair(r,c));
      return result;

    }
}
