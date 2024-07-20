package com.yao.链表;

import com.yao.domain.LinkedNode;

public class 环的入口09 {

    public LinkedNode detectCycle(LinkedNode head){
        LinkedNode fast = head;
        LinkedNode slow = head;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;

            if(fast == slow){
                break ;
            }
        }

        fast = head;
        while(true){
            fast = fast.next;
            slow = slow.next;

            if(fast == slow){
                return slow;
            }
        }
    }

}
