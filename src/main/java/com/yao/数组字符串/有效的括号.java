package com.yao.数组字符串;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class 有效的括号 {

    /**
     * 如下括号：(   {   [   ]   }   )
     * 有效字符串需满足：
     *     1. 左括号必须用相同类型的右括号闭合
     *	   2. 左括号必须以正确的顺序闭合
     *     3. 每个右括号都有一个对应的相同类型的左括号
     */
    public static boolean test20(String s){
        Set<String> leftStr = new HashSet<>(Arrays.asList("(", "{", "["));
        Set<String> rightStr = new HashSet<>(Arrays.asList("]", "}", ")"));

        Stack<String> stack = new Stack<>();

        for(char c : s.toCharArray()) {
            String cc = c + "";

            //左括号
            if(leftStr.contains(cc)){
                stack.push(cc);
                continue ;
            }

            //右括号: 判断匹配,
            if(rightStr.contains(cc)){
                //注意: 栈有可能是空的, 所以需要判断下(空的时候peek和pop都会抛异常—pop底层基于peek),
                if(stack.isEmpty()){
                    return false;
                }

                String left = stack.pop();
                if(
                    left.equals("(") && !cc.equals(")") ||
                    left.equals("{") && !cc.equals("}") ||
                    left.equals("[") && !cc.equals("]")
                ){
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

}
