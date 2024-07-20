package com.yao.链表;

import com.yao.domain.LinkedNode;

public class 链表是否有环08 {

    public static boolean hasCircle(LinkedNode head){
        LinkedNode fast = head;
        LinkedNode slow = head;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;

            if(fast == slow){
                return true;
            }
        }

        return false;
    }
    
}
