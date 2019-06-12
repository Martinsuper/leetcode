package cn.martind;

import cn.martind.algorithm.Solution;
import cn.martind.algorithm.datastruct.ListNode;

public class Main {
    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        listNode = listNode.add(listNode,8);

        ListNode listNode1 = new ListNode(0);

        ListNode pCurrent = Solution.addTwoNumbers(listNode,listNode1);
        while (pCurrent!=null) {
            System.out.println(pCurrent.val);
            pCurrent = pCurrent.next;
        }
    }
}
