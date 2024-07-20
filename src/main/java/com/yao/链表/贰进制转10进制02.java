package com.yao.链表;

import com.yao.domain.LinkedNode;
import com.yao.util.Utils;

public class 贰进制转10进制02 {



    public static void main(String[] args) {
        System.out.println(cal(Utils.build(1, 0, 1, 0)));
    }

    static int res = 0;
    static int idx = 0;
    public static int cal(LinkedNode head){
        doCal(head);
        return res;
    }

    private static void doCal(LinkedNode head) {
        if(head == null){
            return ;
        }

        doCal(head.next);
        res = (int) (res + Math.pow(2, idx) * head.v);
        idx = idx + 1;
    }

}
