package com.yao.tree;

import com.yao.domain.TreeNode;

public class 验证是否为平衡树 {

    /**
     * 验证是否为平衡树: 右 深度差 <= 1.
     */
    public boolean isBalanced(TreeNode root) {
        if(root == null){
            return true;
        }

        int leftDepth  = maxDepth(root.getLeft());
        int rightDepth = maxDepth(root.getRight());

        return
                Math.abs(leftDepth - rightDepth) <= 1 &&
                isBalanced(root.getLeft()) &&
                isBalanced(root.getRight());
    }

    private int maxDepth(TreeNode root){
        if(root == null){
            return 0;
        }

        return Math.max(maxDepth(root.getLeft()), maxDepth(root.getRight())) + 1;
    }

}
