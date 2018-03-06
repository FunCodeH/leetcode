import no1.TwoSum;
import no2.AddTwoNumber;
import no2.ListNode;

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

        System.out.println("no1 测试程序....................");
        int[] nums = new int[]{2, 2, 11, 15};
        int target = 4;
        int[] result = TwoSum.twoSum2(nums,target);
        if(result != null) {
            System.out.println(result[0] + "  " + result[1]);
        }else{
            System.out.println("target 不存在");
        }

        System.out.println("no2 测试程序....................");

        int[] nums1 = new int[]{9};
        int[] nums2 = new int[]{1,9,9,9,9,9,9,9,9,9};
        ListNode l1 = new ListNode(0);
        ListNode l2 = new ListNode(0);

        ListNode l1Temp = l1, l2Temp = l2;

        for (int i: nums1) {
            l1Temp.next = new ListNode(i);
            l1Temp = l1Temp.next;
        }

        for (int i: nums2) {
            l2Temp.next = new ListNode(i);
            l2Temp = l2Temp.next;
        }

        ListNode l3 = AddTwoNumber.addTwoNumbers(l1.next, l2.next);
        while (l3 != null){
            System.out.println("---->" + l3.val);
            l3 = l3.next;
        }
    }
}
