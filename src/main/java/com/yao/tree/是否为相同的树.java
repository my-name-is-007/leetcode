package com.yao.tree;

import com.yao.domain.TreeNode;

public class 是否为相同的树 {

    //是否为 相同的树: 结构相同 且 节点值相同
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null){
            return true;
        }

        if(p == null || q == null){
            return false;
        }

        if(p.getV() != q.getV()){
            return false;
        }

        return isSameTree(p.getLeft(), q.getLeft()) && isSameTree(p.getRight(), p.getRight());
    }

}
