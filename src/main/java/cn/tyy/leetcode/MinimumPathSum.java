package cn.tyy.leetcode;

/**
 * leetcode 64. 最小路径和
 * 给定一个包含非负整数的 m x n 网格 grid ，请找出一条从左上角到右下角的路径，使得路径上的数字总和为最小。
 * 说明：每次只能向下或者向右移动一步。
 * 举例：
 * 输入:
 * arr = [
 * [1,3,1],
 * [1,5,1],
 * [4,2,1]
 * ]
 * 输出: 7
 * 解释: 因为路径 1→3→1→1→1 的总和最小。
 */
public class MinimumPathSum {

    public static int minPathSum(int[][] grid) {
        //步骤一、定义数组元素的含义
        //目的是从左上角走到右下角的最小路径和是多少，故而我们定义dp[i] [j]的含义为，从左上角走到(i,j)这个位置时，最小的路径和是dp[i][j]
        //那么dp[m-1][n-1]就是我们要求的值了
        int m = grid.length;
        int n = grid.length == 0? 0 : grid[0].length;
        if(m <= 0 || n <= 0 ){
            return 0;
        }

        int[][] dp = new int[m][n];

        //步骤二：找出关系数组元素间的关系式
        //走到(i,j)位置有两种方式，从(i-1,j),或者从(i,j-1)走过去，我们要找最小的路径和，显然有
        //dp[i][j] = min(dp[i-1][j], dp[i][j-1]) + dp[i][j];

        //步骤三、找出初始值
        dp[0][0] = grid[0][0];
        for(int i=1; i<m; i++){
            dp[i][0] = dp[i-1][0] + grid[i][0];
        }
        for(int i=1; i<n; i++){
            dp[0][i] = dp[0][i-1] + grid[0][i];
        }

        //步骤四、找出题解值
        for(int i=1; i<m; i++){
            for(int j=1; j<n; j++){
                dp[i][j] = Math.min(dp[i-1][j], dp[i][j-1]) + grid[i][j];
            }
        }
        return dp[m-1][n-1];
    }

    public static void main(String[] args) {
        int[][] grid = {{1,3,1},{1,5,1}, {4,2,1}};
        System.out.println(minPathSum(grid));
    }
}
