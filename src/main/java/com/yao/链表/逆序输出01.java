package com.yao.链表;

import com.yao.domain.LinkedNode;
import com.yao.util.Utils;

public class 逆序输出01 {

    private static void reversePrint(LinkedNode head) {
        if(head == null){
            return ;
        }

        reversePrint(head.next);

        System.out.print(head.v + " ---> ");
    }

    public static void main(String[] args) {
        LinkedNode head = Utils.build();

        reversePrint(head);

        System.out.println();
    }


}
