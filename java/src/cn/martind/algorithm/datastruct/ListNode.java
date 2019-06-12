package cn.martind.algorithm.datastruct;

/**
 * Description:
 *
 * @author : luyao.duan
 * @since : 2019-06-12 13:40:44
 **/
public class ListNode {
    public int val;
    public ListNode next;
    public ListNode(int x) {
        val = x;
    }
    public ListNode add(ListNode listNode, int x) {
        ListNode pre = listNode;
        while (true){
            if (listNode.next == null) {
                listNode.next = new ListNode(x);
                break;
            }
            listNode = listNode.next;
        }
        return pre;
    }
}
