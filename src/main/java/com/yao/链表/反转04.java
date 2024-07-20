package com.yao.链表;

import com.yao.domain.LinkedNode;
import com.yao.util.Utils;

public class 反转04 {

    /**
     * 平时写代码时, 就应该注意截止的位置: 就应该传入stop参数.
     * 方法的反转范围: [head, stop).
     *
     * @param head 头节点, 反转的开始位置, 包含.
     * @param stop 尾节点, 反转的截止位置, 不包含.
     * @return 反转后的头节点.
     */
    public static LinkedNode reverse(LinkedNode head, LinkedNode stop){
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
        LinkedNode head = Utils.build();

        LinkedNode res = reverse(head, null);

        System.out.println(res);
        System.out.println();
    }
}
