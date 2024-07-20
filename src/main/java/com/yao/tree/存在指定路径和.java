package com.yao.tree;

import com.yao.domain.TreeNode;

public class 存在指定路径和 {

    /**
     * 是否存在 根节点到叶子节点 的 路径和 等于 指定值
     */
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null){
            return false;
        }

        if(root.getLeft() == null && root.getRight() == null && root.getV() == targetSum){
            return true;
        }

        return
                hasPathSum(root.getLeft(), targetSum - root.getV()) ||
                hasPathSum(root.getRight(), targetSum - root.getV());
    }

    public static void main(String[] args) {

    }

}
