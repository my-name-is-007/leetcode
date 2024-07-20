package com.yao.数组字符串;

public class 移除等于指定值的元素 {

    /**
     * 给你一个数组 nums 和一个值 val: 原地移除所有数值等于 val 的元素,
     * 并返回移除后数组的新长度
     * 元素的顺序可以改变, 且不需要考虑数组中超出新长度后面的元素.
     * [1, 3, 5, 6, 6, 9]   5
     */
    public static int test27(int[] nums, int v){
        int left = 0;

        //其实这里 i的作用就是定位到当前元素而已, 不涉及定位其他的元素(如前一个或者下一个)或者查看轮数, 那么就可以改为 for(int num : nums)的形式
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == v){
                // do nothing,
            }else{
                nums[left] = nums[i];
                left = left + 1;
            }
        }

        return left + 1;
    }

}
