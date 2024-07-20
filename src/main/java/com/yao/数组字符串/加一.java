package com.yao.数组字符串;

import java.util.LinkedList;

public class 加一 {

    public static int[] plusOne(int[] digits) {
        //存储结果: 后续转成集合.
        LinkedList<Integer> list = new LinkedList<>();

        //上次累加进位结果
        int left = 0;


        for (int i = digits.length - 1; i >= 0; i--) {
            int sum = left + digits[i];
            int low = sum % 10;
            left = sum / 10;

            list.addFirst(low);
        }

        //有残留
        if(left != 0){
            list.addFirst(left);
        }

        //list转数组
        int[] res = new int[list.size()];
        for (Integer i : list) {
            res[i] = list.get(i);
        }

        return res;
    }

    public static void main(String[] args) {

    }

}
