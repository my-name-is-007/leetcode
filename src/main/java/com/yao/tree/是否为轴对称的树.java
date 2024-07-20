package com.yao.tree;

import com.yao.domain.TreeNode;

public class 是否为轴对称的树 {

    /**
     * 注意: 参数应该是两个, 而不是只有 root这一个节点去比较它的左右子树,
     * 那样你会发现兄弟节点之间没法比较了
     * 应该是两个节点: t1.left和t2.right、t1.right和t2.left
     *
     * 另外, 轴对称是需要比较大小的, 他妈的,
     */
    public boolean isSymmetric(TreeNode root) {
        return doIsSymmetric(root.getLeft(), root.getRight());
    }

    private boolean doIsSymmetric(TreeNode left, TreeNode right){
        if(left == null && right == null){
            return true;
        }

        if(left == null || right == null){
            return false;
        }

        //值不相等: 不对称——轴对称是需要比较值大小的)
        if(left.getV() != right.getV()){
            return false;
        }

        return doIsSymmetric(left.getLeft(), right.getRight()) && doIsSymmetric(left.getRight(), right.getLeft());
    }

}
