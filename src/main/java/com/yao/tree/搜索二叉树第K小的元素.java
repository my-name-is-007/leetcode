package com.yao.tree;

import com.yao.domain.TreeNode;

public class 搜索二叉树第K小的元素 {

    //注: 能把答案写出来就行, 不用想着多牛逼的算法,
//也不要总想着不用任何外部变量, 先写出来再说, 啊

    //结果
    int res = 0;

    //当前遍历的是第多少个节点
    int nums = 0;

    public int kthSmallest(TreeNode root, int k) {
        scan(root, k);
        return res;
    }

    public void scan(TreeNode root, int k){
        if(root == null){
            return ;
        }

        scan(root.getLeft(), k);

        //访问
        nums = nums + 1;
        if(nums == k){
            res = root.getV();
        }

        scan(root.getRight(), k);
    }

}
