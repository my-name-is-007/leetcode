package com.yao.链表;

import com.yao.domain.LinkedNode;

public class 合并多个有序链表11 {

    public static LinkedNode merge(LinkedNode[] lists){
        LinkedNode res = lists[0];

        for (int i = 1; i < lists.length; i++) {
            res = doMerge(res, lists[i]);
        }

        return res;
    }

    public static LinkedNode doMerge(LinkedNode l1, LinkedNode l2){
        if(l1 == null){
            return l2;
        }

        if(l2 == null){
            return l1;
        }

        if(l1.v <= l2.v){
            l1.next = doMerge(l1.next, l2);
            return l1;
        }

        if(l2.v < l1.v){
            l2.next = doMerge(l2.next, l1);
            return l2;
        }

        throw new IllegalStateException("下几把咧咧~");
    }
}
