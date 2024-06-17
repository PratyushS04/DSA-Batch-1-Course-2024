class Solution {
    Integer dp[][];
    public int minPathSum(int[][] grid) {
        dp=new Integer[grid.length+1][grid[0].length+1];
        return sol(grid,0,0);
    }
    int sol(int grid[][],int i,int j){
        if(i==grid.length-1&&j==grid[0].length-1){
            return grid[i][j];
        } 
        if(i>=grid.length||j>=grid[0].length){
            return (int) Math.pow(10,9);//MAX_VALUE will surpass the integers when added to grid and making it to the negetive side.
        }  
        if(dp[i][j]!=null){
            return dp[i][j];
        }
        
        return dp[i][j]=Math.min(sol(grid,i+1,j)+grid[i][j],sol(grid,i,j+1)+grid[i][j]);
    }
}
