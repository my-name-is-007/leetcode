package com.yao.链表;

import com.yao.domain.LinkedNode;
import com.yao.util.Utils;

public class 删除倒数第N个节点 {

    public LinkedNode removeNthFromEnd(LinkedNode head, int n) {
        LinkedNode pre = new LinkedNode(-1);
        LinkedNode fast = pre;

        //快指针, 先走N个长度
        for (int i = 1; i <= n; i++) {
            fast = fast.next;
        }

        //快慢指针, 一起走
        LinkedNode slow = pre;
        while(fast.next != null){
            fast = fast.next;
            slow = slow.next;
        }

        //删除节点.
        slow.next = slow.next.next;

        return pre.next;

        // 1 ---> 2 ---> 3 ---> 4 ---> 5 ---> 6 ---> 7 ---> 8 ---> 9
        //删除倒数第3个: 元素 7.
    }

    public static void main(String[] args) {

    }

}
