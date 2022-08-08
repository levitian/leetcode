package cn.tyy.dynamic_programming;

/**
 * 二维数组的 DP
 * 问题描述：一个机器人位于一个 m*n 网格的左上角 （起始点在下图中标记为“Start” ）。机器人每次只能向下或者向右移动一步。
 * 机器人试图达到网格的右下角（在下图中标记为“Finish”）。问总共有多少条不同的路径？
 * <a href="https://blog.csdn.net/y1730008223cong/article/details/123684672">动态规划详解</a>
 */
public class RobotWalkingGrid {
    /**
     * 计算机器人到达网格右下角的总路径数
     * @param m 行
     * @param n 列
     * @return 返回路径数
     */
    public static int walking(int m, int n){
        if(m<=0 || n<=0){
            return 0;
        }
        //定义一个二维数组，每个位置放置该位置有多少种走法
        int[][] dp = new int[m][n];

        //找出关系：数组元素之间的关系式
        //机器人可以向下走和向右走，所以每一格有两种到达方式：dp[i][j] = dp[i-1][j] + dp[i][j-1];

        //找出初始值
        //第一行的所有值
        for(int i=0; i<m; i++){
            dp[i][0] = 1;
        }
        //第一列所有值
        for(int i=0; i<n; i++){
            dp[0][i] = 1;
        }

        //逐一计算每个位置的走法数，最后算出dp[m-1][n-1]的走法数
        for(int i=1; i<m; i++){
            for(int j=1; j<n; j++){
                dp[i][j] = dp[i-1][j] + dp[i][j-1];
            }
        }
        return dp[m-1][n-1];
    }

    public static void main(String[] args) {
        System.out.println(walking(2,2));
    }
}
