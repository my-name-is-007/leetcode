package com.yao.数组字符串;

public class 盛水最多的容器 {

    /**
     * 注意: 应该是声明 起始下标 和 截止下标, 而不是声明 当前长度 和 高度.
     */
    public static int test11(int[] nums) {
        //首尾下标
        int head = 0;
        int tail = nums.length - 1;

        int res = -1;

        while(head < tail){
            //底 乘 高: 高应该选择两者中较小的那个,
            int curArea = (tail - head) * Math.min(nums[head], nums[tail]);

            res = Math.max(res, curArea);

            //左侧高
            if(nums[head] >= nums[tail]){
                tail--;
            }else{
                head++;
            }
        }

        return res;
    }

}
