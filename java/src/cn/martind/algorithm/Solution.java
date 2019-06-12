package cn.martind.algorithm;

import cn.martind.algorithm.datastruct.ListNode;

/**
 * Description:
 *
 * @author : luyao.duan
 * @since : 2019-06-12 13:31:29
 **/
public class Solution {

    /**
     * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
     * <p>
     * 你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
     * <p>
     * 示例:
     * <p>
     * 给定 nums = [2, 7, 11, 15], target = 9
     * <p>
     * 因为 nums[0] + nums[1] = 2 + 7 = 9
     * 所以返回 [0, 1]
     *
     * @param nums
     * @param target
     * @return
     */
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    /**
     * 给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
     *
     * 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
     *
     * 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
     *
     * 示例：
     *
     * 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
     * 输出：7 -> 0 -> 8
     * 原因：342 + 465 = 807
     * @param l1
     * @param l2
     * @return
     */
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode listNode = new ListNode(0);
        ListNode pre = listNode;
        while (l1 != null || l2 != null) {
            int x = l1 == null ? 0 : l1.val;
            int y = l2 == null ? 0 : l2.val;
            int sum = listNode.val;
            sum = sum + x + y;
            boolean isExist = ((l1 == null ? null : l1.next) == null) && ((l2 == null ? null : l2.next) == null);
            if (sum < 10) {
                listNode.val = sum;
                if (!isExist) {
                    listNode.next = new ListNode(0);
                }
            } else {
                listNode.val = sum % 10;
                listNode.next = new ListNode(1);
            }
            l1 = l1 == null ? null : l1.next;
            l2 = l2 == null ? null : l2.next;
            listNode = listNode.next;
        }
        return pre;
    }
}
