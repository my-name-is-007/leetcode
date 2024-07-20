package com.yao.链表;

import com.yao.domain.LinkedNode;

public class 获取中间节点15 {

    /**
     * 获取中间节点15: 偶数时返回中间第二个节点.
     */
    public LinkedNode middleNode(LinkedNode head) {
        //快慢指针: 注意, 此时是相对的向前走, 也没指定说走多远的长度, 所以指向head即可
        LinkedNode fast = head;
        LinkedNode slow = head;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }

        return slow;
        // 1 ---> 2 ---> 3 ---> 4 ---> 5 ---> 6 ---> 7
    }

}
