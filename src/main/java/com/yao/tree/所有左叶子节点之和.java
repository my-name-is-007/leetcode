package com.yao.tree;

import com.yao.domain.TreeNode;

public class 所有左叶子节点之和 {

    /**
     * 注意: 要把右节点也传进去, 因为右节点下面, 也会有左节点
     */
    public int sumOfLeftLeaves(TreeNode root) {
        return doSum(root, 0, false);
    }

    private int doSum(TreeNode root, int sum, boolean leftLeaf){
        if(root == null){
            return sum;
        }

        if(leftLeaf && root.getLeft() == null && root.getRight() == null){
            return sum + root.getV();
        }

        return doSum(root.getLeft(), sum, true) + doSum(root.getRight(), sum, false);
    }

}
