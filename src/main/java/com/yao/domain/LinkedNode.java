package com.yao.domain;

import com.yao.util.Utils;

public class LinkedNode {

    public int v;

    public LinkedNode pre;
    public LinkedNode next;

    public LinkedNode(int v) {
        this.v = v;
    }

    public LinkedNode(int v, LinkedNode next) {
        this.v = v;
        this.next = next;
    }

    public LinkedNode(int v, LinkedNode pre, LinkedNode next) {
        this.v = v;
        this.pre = pre;
        this.next = next;
    }

    public static void main(String[] args) {
        LinkedNode head = Utils.build(1, 2, 3, 4, 5, 6, 7);
        System.out.println(head);
    }

    @Override
    public String toString() {
        return Utils.toString(this);
    }
}
