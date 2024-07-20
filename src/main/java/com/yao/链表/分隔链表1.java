package com.yao.链表;

import com.yao.domain.LinkedNode;
import com.yao.util.Utils;

public class 分隔链表1 {

    public static LinkedNode partition(LinkedNode head, int x) {
        //分别存放小的、大的元素
        LinkedNode d1 = new LinkedNode(-1);
        LinkedNode d2 = new LinkedNode(-1);

        LinkedNode p1 = d1;
        LinkedNode p2 = d2;

        while(head != null){
            if(head.v < x){
                p1.next = head;
                p1 = p1.next;
            }else{
                p2.next = head;
                p2 = p2.next;
            }
            head = head.next;
        }

        p1.next = d2.next;

        //p2的next此时可能还指向原始链表的某个中间节点
        p2.next = null;

        return d1.next;
    }

    public static void main(String[] args) {
        LinkedNode head = Utils.build(1, 4, 3, 2, 5, 2);
        LinkedNode res = partition(head, 3);
        System.out.println(res);

    }

}
