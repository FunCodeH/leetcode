package no1;

import java.util.HashMap;
import java.util.Map;

/**
 * Function: TODO: ADD FUNCTION <br>
 *
 * @Author: HeWenBo <br>
 * @Date: 2018-03-05 下午3:01
 * Given nums = [2, 7, 11, 15], target = 9,
 * Because nums[0] + nums[1] = 2 + 7 = 9,
 * return [0, 1].
 */
public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {

        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if((nums[i] + nums[j]) == target){
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }

        }
        return null;
    }

    /**
     * 使用hashMap 只需要一次循环，减小时间复杂度
     * @param nums
     * @param target
     * @return
     */
    public static int[] twoSum2(int[] nums, int target){
        Map<Integer, Integer>  map = new HashMap<>();
        int element = 0;
        for (int i = 0; i < nums.length; i++) {
            element = target - nums[i];
            if(map.containsKey(element)){
                return new int[]{map.get(element), i};
            }
            map.put(nums[i],i);
        }

        return null;
    }

}
