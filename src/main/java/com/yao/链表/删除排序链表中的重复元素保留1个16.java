package com.yao.链表;

import com.yao.domain.LinkedNode;

public class 删除排序链表中的重复元素保留1个16 {

    /**
     * 删除排序链表中的重复元素1: 重复的留下一个.
     * 注意: 当删除了next节点之后, 不要设置 cur = cur.next, 如果设置了, 那么就不会比较当前节点和next了, 而是比较 next 和 next的next.
     */
    public LinkedNode deleteDuplicates(LinkedNode head) {
        LinkedNode cur = head;
        while(cur != null && cur.next != null){
            if(cur.v == cur.next.v){
                cur.next = cur.next.next;
                //不要加下面这行代码
                //cur = cur.next;
            }else{
                cur = cur.next;
            }
        }

        return head;
    }

    public static void main(String[] args) {

    }

}
