package com.yao.数组字符串;

public class 是否回文数字 {

    /**
     * 12321、907709 ......
     */
    public static boolean isPalindrome(int x) {

        int copyed = x;

        int res = 0;

        while(true){
            int low = copyed % 10;
            copyed = copyed / 10;

            res = res * 10 + low;

            if(copyed != 0){
                break ;
            }
        }

        return res == x;
    }

}
