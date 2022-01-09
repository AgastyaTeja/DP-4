//221 Maximal Square
// Time - O(n2)
// space - O(n2)
class Solution {
    public int maximalSquare(char[][] matrix) {
        
        int m = matrix.length;
        int n = matrix[0].length;
        int max = 0;
        
        int[][] dp = new int[m + 1][n + 1];
        
        
        for(int i = 1; i <= m; i++){
            
            for(int j = 1; j <= n; j++){
                
                if (matrix[i - 1][j - 1] == '1'){
                    // System.out.println(dp[i - 1][j] +"-->" + dp[i][j-1] +"-->" + dp[i-1][j-1]);
                    dp[i][j] = Math.min(dp[i- 1][j],dp[i][j-1]);
                    dp[i][j] = Math.min(dp[i - 1][j - 1], dp[i][j]);
                    dp[i][j] = dp[i][j] + 1 ;
                     
                    max = Math.max(dp[i][j], max);
                }

            }
        }
        
        return max * max ;
    }
}