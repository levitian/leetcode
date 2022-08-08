package cn.tyy.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * leetcode 217. 存在重复元素
 */
public class ContainsDuplicate {

    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int  num : nums){
            set.add(num);
        }
        return nums.length > set.size();
    }

    //官方题解2
    public boolean containsDuplicate2(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int  num : nums){
            //Set新增元素会返回boolean类型的返回值
            if(!set.add(num)){
                return true;
            }
        }
        return false;
    }
}
