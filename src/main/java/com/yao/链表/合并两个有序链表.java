package com.yao.链表;

import com.yao.domain.LinkedNode;
import com.yao.util.Utils;

public class 合并两个有序链表 {

    public static LinkedNode merge(LinkedNode l1, LinkedNode l2){
        if(l1 == null){
            return l2;
        }

        if(l2 == null){
            return l1;
        }

        if(l1.v <= l2.v){
            l1.next = merge(l1.next, l2);
            return l1;
        }

        if(l2.v < l1.v){
            l2.next = merge(l2.next, l1);
            return l2;
        }

        throw new IllegalStateException("下几把咧咧~");
    }

    public static void main(String[] args) {
        LinkedNode l1 = Utils.build();
        LinkedNode l2 = Utils.build();

        LinkedNode res = merge(l1, l2);
        System.out.println(res);
    }


}
