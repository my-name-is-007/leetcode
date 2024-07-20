package com.yao.数组字符串;

import java.util.HashMap;
import java.util.Map;

public class 最长不重复字串 {

    public static int lengthOfLongestSubstring(String s) {
        int ans = 0;

        //不重复子串的开始位置为 start，结束位置为 end
        int start = 0;
        int end   = 0;

        //key: 字符，value: 字符位置 +1(加 1 表示从字符位置后一个才开始不重复)
        Map<Character, Integer> map = new HashMap<>();

        for (; end < s.length(); end++) {
            char alpha = s.charAt(end);
            if (map.containsKey(alpha)) {
                //abba
                //随着 end 不断遍历向后，会遇到与 [start, end] 区间内字符相同的情况
                //此时将字符作为 key 值，获取其 value 值，并更新 start

                start = Math.max(map.get(alpha)+1, start);
            }

            //更新存储情况.
            ans = Math.max(ans, end - start + 1);
            map.put(s.charAt(end), end);
        }

        return ans;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abba"));
    }




}
