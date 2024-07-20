package com.yao.链表;

import com.yao.domain.LinkedNode;

public class 根据指定值链表分隔 {

    /**
     * 分隔链表1: 给定链表头 和特定值 x: 使 小于x的节点 都出现在大于或等于x的节点之前.
     * 两个分区中, 每个节点的相对位置不变.
     *
     * @param head
     * @param x
     * @return
     */
    public LinkedNode partition(LinkedNode head, int x) {
        LinkedNode p1 = new LinkedNode(-1);
        LinkedNode cur1 = p1;

        LinkedNode p2 = new LinkedNode(-1);
        LinkedNode cur2 = p2;

        //遍历整个链表.
        LinkedNode tmp = head;
        while(tmp != null){
            if(tmp.v < x){
                cur1.next = tmp;
                cur1 = cur1.next;
            }else{
                cur2.next = tmp;
                cur2 = cur2.next;
            }

            tmp = tmp.next;
        }

        //两个链表关联起来
        cur1.next = p2.next;

        //如果最后一个节点是小的值, 那么大的链表的结尾的next会指向小链表的结尾
        cur2.next = null;

        return p1.next;
    }

}
