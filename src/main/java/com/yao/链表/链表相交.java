package com.yao.链表;

import com.yao.domain.LinkedNode;

public class 链表相交 {

    public static LinkedNode getIntersectionNode(LinkedNode head1, LinkedNode head2){
        LinkedNode copyedHead1 = head1;
        LinkedNode copyedHead2 = head2;

        while(copyedHead1 != copyedHead2){
            copyedHead1 = copyedHead1.next == null ? head2 : copyedHead1.next;
            copyedHead2 = copyedHead2.next == null ? head1 : copyedHead2.next;
        }
        
        return copyedHead1;
    }

    public static void main(String[] args) {

    }

}
