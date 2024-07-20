package com.yao.数组字符串;

public class 最大子数组和 {

    //
//(子数组最少包含一个元素)：返回其最大和.
//

    //注：应该看当前和对当前遍历的元素, 是否有增益效果. 而不是看
//当前遍历的元素对当前和是否有增益效果.
//因为要求是连续的, 所以必须要加上当前元素的值(如 [4, -1, 4]).

    /**
     * 给你一个整数数组 nums, 找出一个具有最大和的连续子数组.
     *
     * 子数组 是数组中的一个连续部分.
     * @param arr
     * @return
     */
    public static int maxSubArray(int[] arr) {

        int curSum = 0;
        int maxSum = 0;

        for(int num : arr) {
            if(curSum < 0){
                curSum = 0;
            }

            curSum = curSum + num;

            maxSum = Math.max(curSum, maxSum);
        }

        return maxSum;
    }

}
