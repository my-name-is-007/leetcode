package com.yao.数组字符串;

public class 最长公共前缀 {

    /**
     * 查找字符串数组中的最长公共前缀：不存在就 返回空串""
     * ["flower","flow","flight"] ===> "fl"
     * ["dog","racecar","car"] ===> ""
     */
    public static String test14(String[] ss) {
        char[] flag = ss[0].toCharArray();

        StringBuilder res = new StringBuilder();

        for (int i = 0; i < flag.length; i++) {
            for (int i1 = 1; i1 < ss.length; i1++) {
                if(ss[i1].charAt(i) != flag[i]){
                    return res.toString();
                }
            }

            res.append(flag[i]);
        }

        return res.toString();
    }

}
