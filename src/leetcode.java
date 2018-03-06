import no1.TwoSum;

import java.util.HashMap;
import java.util.Map;

/**
 * Function: TODO: ADD FUNCTION <br>
 *
 * @Author: HeWenBo <br>
 * @Date: 2018-03-05 下午2:59
 */
public class leetcode {
    public static void main(String[] args) {

        ///////////////twoSum 测试程序//////////////////
        int[] nums = new int[]{2, 2, 11, 15};
        int target = 4;
        int[] result = TwoSum.twoSum2(nums,target);
        if(result != null) {
            System.out.println(result[0] + "  " + result[1]);
        }else{
            System.out.println("target 不存在");
        }
    }
}
