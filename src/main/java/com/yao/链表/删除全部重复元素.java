package com.yao.链表;

import com.yao.domain.LinkedNode;
import com.yao.util.Utils;

public class 删除全部重复元素 {

    public static LinkedNode deleteDuplicates(LinkedNode head) {
        if(head == null){
            return null;
        }

        //因为重复的1个不留: 所以需要虚拟指针
        LinkedNode dummyHead = new LinkedNode(-1);
        dummyHead.next = head;
        LinkedNode pre = dummyHead;

        LinkedNode cur = head;

        while(cur != null && cur.next != null){
            if(cur.v == cur.next.v){
                int val = cur.v;
                //这里要一直删, 如果不一直删, 而是放到外部大循环的话,
                //会造成有的节点无法 删除的情况
                while(cur != null && cur.v == val){
                    cur = cur.next;
                }
                pre.next = cur;
            }else{
                pre = cur;
                cur = cur.next;
            }
        }
        return dummyHead.next;
    }

    public static void main(String[] args) {
        LinkedNode head = Utils.build(1, 2, 2, 3, 4, 5, 5, 6, 7, 7, 8, 9, 9);
        LinkedNode res = deleteDuplicates(head);
        System.out.println(res);
    }
}
