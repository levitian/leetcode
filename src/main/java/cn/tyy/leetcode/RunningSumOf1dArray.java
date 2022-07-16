package cn.tyy.leetcode;

/**
 * 2022-06-18
 * 1480. 一维数组的动态和
 * 给你一个数组 nums 。数组「动态和」的计算公式为：runningSum[i] = sum(nums[0]…nums[i]) 。
 *
 * 请返回 nums 的动态和。
 *
 * 来源：力扣（LeetCode）
 * 链接：<a href="https://leetcode.cn/problems/running-sum-of-1d-array">...</a>
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class RunningSumOf1dArray {

    /**
     * 自己实现
     * @param nums
     * @return
     */
    public int[] runningSumByMe(int[] nums) {
        int[] results = new int[nums.length];
        for(int i = 0; i<nums.length; i++){
            int result = 0;
            for(int h=0; h<=i; h++){
                result += nums[h];
            }
            results[i] = result;
        }
        return results;
    }

    /**
     * 官方题解
     * @param nums
     * @return
     */
    public int[] runningSum(int[] nums) {

        for(int i = 1; i<nums.length; i++){

            nums[i] += nums[i-1];
        }
        return nums;
    }
}
