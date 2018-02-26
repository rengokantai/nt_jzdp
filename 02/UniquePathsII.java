public class UnionPathsII {
    /**
     * @param obstacleGrid: A list of lists of integers
     * @return: An integer
     */
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        // write your code here
        int m=obstacleGrid.length;
        if(m==0){
            return 0;
        }
        
        int n = obstacleGrid[0].length;
        if(n==0){
            return 0;
        }
        
        int[][] f = new int[m][n];
        
        int i,j;
        
        for(i=0;i<m;++i){
            for(j=0;j<n;++j){
                if(obstacleGrid[i][j]==1){
                    f[i][j]=0;
                }else{
                    if(i==0&&j==0){
                        f[i][j]=1;
                    }
                    else{
                        f[i][j]=0;
                        if(i-1>=0){
                            f[i][j]+=f[i-1][j];
                        }
                        if(j-1>=0){
                            f[i][j]+=f[i][j-1];
                        }
                    }
                }
            }
        }
        return f[m-1][n-1];
    }
}
