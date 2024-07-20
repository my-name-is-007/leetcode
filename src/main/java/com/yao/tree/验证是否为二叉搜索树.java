package com.yao.tree;

import com.yao.domain.TreeNode;

public class 验证是否为二叉搜索树 {

    /**
     * 验证是否为二叉搜索树: 一个节点的值要小于A且大于B
     */
    public boolean isValidBST(TreeNode root) {
        return doIsValidBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    /**
     * 注意后两个参数的含义, 表示该root要大于min且小于max, 传进去之后由当前程序判断是否合法,
     * 而不是传它肯定满足的条件, 之前差点儿把 Integer.MIN_VALUE 和 Integer.MAX_VALUE 给传反了
     *
     */
    private boolean doIsValidBST(TreeNode root, int left, int right){
        if(root == null){
            return true;
        }

        return
                (root.getV() > left && root.getV() < right) &&
                doIsValidBST(root.getLeft(), left, root.getV()) &&
                doIsValidBST(root.getRight(), root.getV(), right);
    }

}
