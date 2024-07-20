package com.yao.数组字符串;

public class 删除有序数组中的重复项 {

    public static int test25(int[] arr){

        int left = 0;
        int right = left + 1;

        while(right < arr.length){
            //注意: 我他妈开始时没想到要有continue, 当时还纳闷怎么执行一次就跳出if了呢
            //这里可能加个continue, 或者加个while循环, 但是while要注意别超出范围, 上层有判断范围, 这里也要判断的
            if (arr[left] == arr[right]){
                right = right + 1;
                continue ;
            }

            arr[left + 1] = arr[right];
            left = left + 1;
            right = right + 1;
        }

        return left + 1;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 1, 3, 4, 5, 5, 6};
        test25(arr);
    }

}
