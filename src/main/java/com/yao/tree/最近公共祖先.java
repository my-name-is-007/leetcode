package com.yao.tree;

import com.yao.domain.TreeNode;

public class 最近公共祖先 {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null || root == p || root == q){
            return root;
        }

        TreeNode left = lowestCommonAncestor(root.getLeft(), p, q);
        TreeNode right = lowestCommonAncestor(root.getRight(), p, q);

        if(left == null && right == null){
            return null;
        }

        if(left == null){
            return right;
        }

        if(right == null){
            return left;
        }

        return root;
    }

}
