package com.yao.链表;

import com.yao.domain.LinkedNode;

public class 删除所有value等于给定值的元素 {

    public LinkedNode removeElements(LinkedNode head, int val) {
        //因为head一样可以删除, 所以需要先创建一个前置的虚拟节点
        LinkedNode pre = new LinkedNode(-1);
        pre.next = head;

        //当前遍历到的节点
        LinkedNode cur = pre;

        while(cur != null && cur.next != null){
            if(cur.next.v == val){
                cur.next = cur.next.next;
            }else{
                cur = cur.next;
            }
        }

        return pre.next;
    }

    public static void main(String[] args) {

    }

}
