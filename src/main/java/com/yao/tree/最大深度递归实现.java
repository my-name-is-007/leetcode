package com.yao.tree;

import com.yao.domain.TreeNode;

public class 最大深度递归实现 {

    public int maxDepth(TreeNode root) {
        if(root == null){
            return 0;
        }

        return Math.max(maxDepth(root.getLeft()), maxDepth(root.getRight())) + 1;
    }

    public static void main(String[] args) {

    }

}
