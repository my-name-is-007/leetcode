package com.yao.tree;

import com.yao.domain.TreeNode;

public class 验证一棵树是否为另一棵树的子树 {

    /**
     * 验证一棵树是否为另一棵树的子树
     */
    public static boolean isSubTree(TreeNode s, TreeNode t) {
        //因为是不停的递归, 所以s可能是null, 而t始终不变,
        if(s == null){
            return false;
        }

        //左侧子树 或 右侧子树: 这里要注意, 参数t应始终不变,
        //isTreeEquals传入当前两个节点, isSubTree 传入当前的左右子树 和 t
        return isTreeEquals(s, t) || isSubTree(s.getLeft(), t) || isSubTree(s.getRight(), t);
    }

    private static boolean isTreeEquals(TreeNode s, TreeNode t){
        if(s == null && t == null){
            return true;
        }

        if(s == null || t == null){
            return false;
        }

        return s == t && isTreeEquals(s.getLeft(), t.getLeft()) && isTreeEquals(s.getRight(), t.getRight());
    }

}
