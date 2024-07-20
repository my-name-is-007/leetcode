package com.yao.链表;

import com.yao.domain.LinkedNode;
import com.yao.util.Utils;

public class 反转指定区间 {

    /**
     * 反转从位置 left 到位置 right 的链表节点, 返回 反转后的链表.
     *
     * 注意: 一定要让 leftNode 和 pre 发生关系, 让leftNode指向pre. 不然关系链就断了.
     * 当left不等于1的时候, 这个没问题, 但是如果从头开始, 那么中间的链条就断了.
     *
     * 不过开始的时候, 根本没声明pre指针, 直接返回的head. 那么这时候可能就需要判断 left是否为1了:
     *     是1: 返回head
     *     不是: 返回leftNode.next
     */
    public static LinkedNode reverseBetween1(LinkedNode head, int left, int right) {
        LinkedNode pre = new LinkedNode(-1);
        pre.next = head;

        //左节点.
        LinkedNode leftNode = pre;
        for (int i = 1; i <= left - 1; i++) {
            leftNode = leftNode.next;
        }

        //右节点.
        LinkedNode rightNode = new LinkedNode(-1);
        rightNode.next = head;
        for (int i = 1; i <= right; i++) {
            rightNode = rightNode.next;
        }
        rightNode = rightNode.next;


        LinkedNode reversedNode = doReverse(leftNode.next, rightNode);
        leftNode.next.next = rightNode;
        leftNode.next = reversedNode;

        //left = 4, right = 6.
        // 1 ---> 2 ---> 3(left)    ---> 6(reversedNode) ---> 5 ---> 4 --->      7(right) ---> 8 ---> 9



        return pre.next;
    }

    private static LinkedNode doReverse(LinkedNode leftNode, LinkedNode rightNode) {
        LinkedNode pre = null;
        LinkedNode next= null;
        while (leftNode != rightNode){
            next = leftNode.next;
            leftNode.next = pre;
            pre = leftNode;
            leftNode = next;
        }

        return pre;
    }

    public static void main(String[] args) {
        System.out.println(reverseBetween1(Utils.build(), 1, 3));
        System.out.println(reverseBetween1(Utils.build(), 2, 3));
    }

}
