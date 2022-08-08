package cn.tyy.leetcode;

/**
 * 53. 最大子数组和
 * 给你一个整数数组 nums ，请你找出一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
 * 子数组 是数组中的一个连续部分。
 * 示例 1：
 * 输入：nums = [-2,1,-3,4,-1,2,1,-5,4]
 * 输出：6
 * 解释：连续子数组[4,-1,2,1] 的和最大，为6 。
 * 来源：力扣（LeetCode）
 * 链接：<a href="https://leetcode.cn/problems/maximum-subarray">...</a>
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class MaximumSubarray {


    public static int maxSubArray1(int[] nums) {
        //1、定义一个数组dp：dp[i]为以第i个元素为结尾的连续子数组的最大和, 最后求出dp中max值即为结果值
        int[] dp = new int[nums.length];

        //2、元素间的关系：dp[i] = max(dp[i-1]+nums[i], nums[i])
        //3、找出初始值
        int maxSubArrayCount = nums[0];
        dp[0] = nums[0];
        for(int i=1; i<nums.length; i++){
            dp[i] = Math.max(dp[i-1] + nums[i], nums[i]);
            maxSubArrayCount = Math.max(dp[i], maxSubArrayCount);
        }

        return maxSubArrayCount;
    }

    public static int maxSubArray2(int[] nums) {
        //1、定义一个数组dp：dp[i]为以第i个元素为结尾的连续子数组的最大和, 最后求出dp中max值即为结果值
        //int[] dp = new int[nums.length];

        //2、元素间的关系：dp[i] = max(dp[i-1]+nums[i], nums[i])
        //3、找出初始值
        int maxSubArrayCount = nums[0];
        int dp = 0;
        for (int num : nums) {
            dp = Math.max(dp + num, num);
            maxSubArrayCount = Math.max(dp, maxSubArrayCount);
        }

        return maxSubArrayCount;
    }
}

