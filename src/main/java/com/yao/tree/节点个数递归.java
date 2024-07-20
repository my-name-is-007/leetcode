package com.yao.tree;

import com.yao.domain.TreeNode;

public class 节点个数递归 {

     public int nums(TreeNode root){
        if(root == null){ return 0; }

        //左侧个数 + 右侧个数 + 当前节点也算1个
        return nums(root.getLeft()) + nums(root.getRight()) + 1;
    }

}
