package com.yao.链表;

import com.yao.domain.LinkedNode;
import com.yao.util.Utils;

public class 回文链表 {

    /**
     * 当一个指针不够的时候, 再加上一个指针, 这里最少要有两个:
     *     一个不停的递归, 调用next
     *     另一个不停的指向next,
     *   让两者比较
     * 但是传入的head不能变, 所以又增加了一个指针来使用, 以保证参数head不变.
     *
     * 而且, 不停向下next的那个指针, 应该是全局的, 因为如果是局部的话, 在本次执行中虽然指向了next, 但是递归回到上层后, 还是最初的head指针, 根本没有变.
     * @param head
     * @return
     */
    static LinkedNode header = null;
    public static boolean isXXX(LinkedNode head){
        LinkedNode cur = head;
        header = head;

        return doIsXXX(cur);
    }

    public static boolean doIsXXX(LinkedNode cur){
        if(cur == null){
            return true;
        }

        boolean res = doIsXXX(cur.next) && header.v == cur.v;
        header = header.next;
        return res;
    }

    public static void main(String[] args) {
        LinkedNode head = Utils.build(1,2,3,4,5,5,4,3,2,1);
        System.out.println(isXXX(head));
        System.out.println(head);
    }

}
