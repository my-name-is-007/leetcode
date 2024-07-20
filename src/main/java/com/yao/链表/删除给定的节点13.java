package com.yao.链表;

import com.yao.domain.LinkedNode;

public class 删除给定的节点13 {

    /**
     * 删除给定的节点13: 其实就是把next删掉, 但是要将next的值先保留下来
     *     1. 先把下个节点的值, 赋值给当前元素: 先保留下来
     *     2. 再把next节点删除掉.
     */
    public void deleteNode(LinkedNode node) {
        node.v = node.next.v;
        node.next = node.next.next;
    }

    public static void main(String[] args) {

    }

}
