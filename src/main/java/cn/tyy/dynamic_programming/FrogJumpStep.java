package cn.tyy.dynamic_programming;

/**
 * 案例一、简单的一维 DP
 * 问题描述：一只青蛙一次可以跳上1级台阶，也可以跳上2级。求该青蛙跳上一个n级的台阶总共有多少种跳法。
 * <a href="https://blog.csdn.net/y1730008223cong/article/details/123684672">动态规划详解</a>
 */
public class FrogJumpStep {

    public static int jump(int n){
        if(n<=1){
            return n;
        }
        int[] dp = new int[n+1];
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;
        for(int i = 3; i<=n; i++){
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }

    public static void main(String[] args) {
        System.out.println(jump(3));

        //超出取值范围
        System.out.println(jump(46));

    }
}
