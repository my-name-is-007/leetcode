package com.yao.链表;

import com.yao.domain.LinkedNode;
import com.yao.util.Utils;

public class 两数相加逆序存储 {

    /**
     * 两个逆序存放的整数链表相加求和: 结果也要逆序.
     * 2--->4--->1 +
     * 5--->6--->4 =
     * 7--->0--->6: 最后返回 7--->0--->6 链表即可.
     * 注: 这里你最先想到的可能是 int类型的临时变量、数学计算逻辑, 那就先把它们写出来嘛
     *
     * 另外, 不能直接赋值next——因为copyedHead1/2可能为null.
     */
    public static LinkedNode sum(LinkedNode head1, LinkedNode head2){

        //上次计算进位结果.
        int left = 0;

        //保留开始位置
        LinkedNode cur = new LinkedNode(-1);
        LinkedNode pre = cur;

        LinkedNode copyedHead1 = head1;
        LinkedNode copyedHead2 = head2;

        while(copyedHead1 != null || copyedHead2 != null || left != 0){
            int sum = val(copyedHead1) + val(copyedHead2) + left;
            int low = sum % 10;
            left = sum / 10;

            //构建结果链表.
            cur.next = new LinkedNode(low);
            cur = cur.next;

            //注意: 不能直接赋值next——当前节点可能为null
            copyedHead1 = copyedHead1 == null ? null : copyedHead1.next;
            copyedHead2 = copyedHead2 == null ? null : copyedHead2.next;
        }

        return pre.next;
    }

    private static int val(LinkedNode node){
        return node == null ? 0 : node.v;
    }

    public static void main(String[] args) {
        System.out.println(sum(Utils.build(2, 4, 1), Utils.build(5, 6, 4)));
    }

}
