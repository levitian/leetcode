package cn.tyy.leetcode;

public class RemoveDuplicatesFromSortedArray {

    public int removeDuplicates(int[] nums) {
        int current = nums[0];
        for(int h = 1; h<nums.length; h++){
            if(nums[h] == current){
                for(int i = h+1; i<nums.length; i++){
                    nums[h] = nums[h+1];
                }
            }else {
                current = nums[h];
            }

        }

        return 0;
    }
}
