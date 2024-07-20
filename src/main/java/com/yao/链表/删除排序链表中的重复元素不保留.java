package com.yao.链表;

import com.yao.domain.LinkedNode;

public class 删除排序链表中的重复元素不保留 {

    public LinkedNode deleteDuplicates(LinkedNode head) {
        //前置节点, 保留head引用: 因为head很可能也没了
        LinkedNode pre = new LinkedNode(-1);
        pre.next = head;

        //左右两个节点
        LinkedNode leftNotEqualNode = pre;
        LinkedNode rightEqualNode   = head;

        while(rightEqualNode != null && rightEqualNode.next != null){
            if(rightEqualNode.v == rightEqualNode.next.v){
                //取出变量
                int val = rightEqualNode.v;

                //注意: 这里有个误区, 在下面的循环中, 判断的就应该是当前值和定义出来的变量了, 而不是当前值和下一个值
                //另外就是, 删除节点的操作应该在这里进行这个if中进行, 而不是下面的else中
                while(rightEqualNode != null && rightEqualNode.v == val){
                    rightEqualNode = rightEqualNode.next;
                }

                //删除中间节点
                leftNotEqualNode.next = rightEqualNode;
            }else{
                //两者向前推进
                rightEqualNode = rightEqualNode.next;
                leftNotEqualNode = leftNotEqualNode.next;
            }
        }

        return pre.next;
    }

}
