package com.yao.数组字符串;

public class 最长回文子串 {

    //找出字符串中：最长的回文子串
    public static String test5(String s){

        int maxLength = -1;
        String res = "";

        for (int i = 0; i < s.toCharArray().length - 1; i++) {
            String s1 = str(s, i, i);
            String s2 = str(s, i, i+ 1 );

            String curMaxStr = s1.length() >= s2.length() ? s1 : s2;
            if(maxLength < curMaxStr.length()){
                res = curMaxStr;
                maxLength = res.length();
            }
        }

        return res;
    }

    private static String str(String s, int left, int right){
        while(left >= 0 && right <= s.length() - 1){
            if(s.charAt(left) == s.charAt(right)){
                left = left - 1;
                right = right - 1;
            }else{
                return s.substring(left, right + 1);
            }
        }

        throw new IllegalStateException();
    }

}
