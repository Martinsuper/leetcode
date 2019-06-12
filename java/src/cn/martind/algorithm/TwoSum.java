package cn.martind.algorithm;

/**
 * Description:
 *
 * @author : luyao.duan
 * @since : 2019-06-12 11:48:56
 **/
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if (nums[i] + nums[j] == target) {
                    return new int[]{i,j};
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
