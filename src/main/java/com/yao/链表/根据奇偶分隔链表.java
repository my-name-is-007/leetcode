package com.yao.链表;

import com.yao.domain.LinkedNode;

public class 根据奇偶分隔链表 {

    /**
     * 奇数下标节点放左侧, 偶数节点下标放右边.
     *
     * odd: 技术
     * even: 偶数
     */
    public LinkedNode oddEvenList(LinkedNode head) {
        //奇数节点
        LinkedNode p1 = new LinkedNode(-1);
        LinkedNode cur1 = p1;

        //偶数节点
        LinkedNode p2 = new LinkedNode(-1);
        LinkedNode cur2 = p2;

        LinkedNode tmp = head;
        boolean odd = true;
        while(tmp != null){
            if(odd){
                cur1.next = tmp;
                cur1 = cur1.next;
            }else{
                cur2.next = tmp;
                cur2 = cur2.next;
            }

            odd = !odd;
            tmp = tmp.next;
        }

        cur1.next = p2.next;
        cur2.next = null;

        return p1.next;
    }

}
