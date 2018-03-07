package no2;

import java.math.BigInteger;

/**
 * Function: TODO: ADD FUNCTION <br>
 *
 * @Author: HeWenBo <br>
 * @Date: 2018-03-06 下午3:44
 *
 * You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 * Example
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 0 -> 8
 * Explanation: 342 + 465 = 807.
 */
public class AddTwoNumber {

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l1Temp = l1;
        ListNode l2Temp = l2;
        String l1Str = "";
        String l2Str = "";
        //step1:输入的链表转化为字符串
        while (l1Temp != null){
            l1Str = l1Str + l1Temp.val;
            l1Temp = l1Temp.next;
        }
        l1Str = new StringBuffer(l1Str).reverse().toString();
        System.out.println("l1---->" + l1Str);

        while (l2Temp != null){
            l2Str = l2Str + l2Temp.val;
            l2Temp = l2Temp.next;
        }
        l2Str = new StringBuffer(l2Str).reverse().toString();
        System.out.println("l2---->" + l2Str);

        //step2：将字符串转化为BigInteger进行加法运算，之后转化为字符串并逆序，然后整合成链表返回结果
        String result = new StringBuffer(new BigInteger(l1Str).add(new BigInteger(l2Str)).toString()).reverse().toString();
        ListNode listNodeResult = new ListNode(0);
        ListNode lTemp = listNodeResult;
        while (result.length() != 0){
            lTemp.next  = new ListNode(result.charAt(0) - 48);
            result = result.substring(1, result.length());
            lTemp = lTemp.next;
        }
        return listNodeResult.next;
    }

    /**
     * 官方解法，直接使用加法运算，处理更巧妙
     * @param l1
     * @param l2
     * @return
     */
    public ListNode addTwoNumbers2(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode p = l1, q = l2, curr = dummyHead;
        int carry = 0;
        while (p != null || q != null) {
            int x = (p != null) ? p.val : 0;
            int y = (q != null) ? q.val : 0;
            int sum = carry + x + y;
            carry = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            if (p != null) p = p.next;
            if (q != null) q = q.next;
        }
        if (carry > 0) {
            curr.next = new ListNode(carry);
        }
        return dummyHead.next;
    }
}
