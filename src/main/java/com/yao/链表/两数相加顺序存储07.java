package com.yao.链表;

import com.yao.domain.LinkedNode;
import com.yao.util.Utils;

import java.util.Stack;

public class 两数相加顺序存储07 {

    /**
     * 两个正序存放的整数链表相加求和: 结果也要正序.
     * 7--->2--->4--->3
     *      5--->6--->4
     * 7--->8--->0--->7: 最后返回 7--->8--->0--->7.
     *
     * 注意: 因为是返回顺序的, 所以相当于是从头部插入结果, 这点要注意.
     */
    public static LinkedNode sum(LinkedNode head1, LinkedNode head2){
        //head1加入Stack
        Stack<LinkedNode> stack1 = new Stack();
        LinkedNode tmp1 = head1;
        while(tmp1 != null){
            stack1.push(tmp1);
            tmp1 = tmp1.next;
        }

        //head2加入Stack
        Stack<LinkedNode> stack2 = new Stack();
        LinkedNode tmp2 = head2;
        while(tmp2 != null){
            stack2.push(tmp2);
            tmp2 = tmp2.next;
        }

        //上次计算遗留下的数据
        int left = 0;

        LinkedNode pre = new LinkedNode(-1);

        while(!stack1.isEmpty() || !stack2.isEmpty() || left != 0){
            int sum = pop(stack1) + pop(stack2) + left;
            int low = sum % 10;
            left = sum / 10;

            //这里要注意: 相当于是从头部开始插入的, 不是尾插了, 不过这里也锻炼了下头插的逻辑
            LinkedNode cur = new LinkedNode(low);
            cur.next = pre.next;
            pre.next = cur;
        }

        return pre.next;
    }

    private static int pop(Stack<LinkedNode> stack){
        return stack.isEmpty() ? 0 : stack.pop().v;
    }

    public static void main(String[] args) {
        System.out.println(sum(Utils.build(7, 2, 4, 3), Utils.build(5, 6, 4)));
    }

}
