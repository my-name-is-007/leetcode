package com.yao.链表;

import com.yao.domain.LinkedNode;
import com.yao.util.Utils;

public class K个一组反转 {

    /**
     * 剩余数量小于K时: 不反转.
     *
     * 注意: 当前组反转之后, 要设置头节点head的next, 其实也就是将当前组和下一组关联起来: head.next = 下一组返回的head.
     */
    public static LinkedNode reverse(LinkedNode head, int k){
        //有一个前置的虚拟节点.
        LinkedNode stop = new LinkedNode(-1);
        stop.next = head;

        //找到第K个节点.
        for (int i = 1; i <= k; i++) {
            stop = stop.next;

            if(stop == null){
                return head;
            }
        }

        //因为反转的时候不包含最后一个节点, 所以再向后走一个
        stop = stop.next;

        //反转
        LinkedNode start = doReverse(head, stop);

        //反转之后, head到了尾部, 下一个应该指向下一组的开头.
        head.next = reverse(stop, k);

        return start;
    }

    private static LinkedNode doReverse(LinkedNode head, LinkedNode stop) {
        LinkedNode pre = null;
        LinkedNode next = null;

        while (head != stop){
            next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }

        return pre;
    }

    public static void main(String[] args) {
        System.out.println(reverse(Utils.build(), 3));
        System.out.println(reverse(Utils.build(), 2));
    }

}
