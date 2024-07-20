package com.yao.tree;

import com.yao.domain.TreeNode;

public class 二叉树镜像也叫轴对称反转 {

    //
//
//

    /**
     * 反转二叉树: 根据轴进行反转, 其实就是求树的镜像或者轴对称
     * 上个问题是判断轴对称, 这个是 求轴对称
     * 这个是可以一个参数的: 因为当前节点的左右是要互换的
     * @param root
     * @return
     */
    public TreeNode invertTree(TreeNode root) {
        if(root == null){
            return null;
        }

        //当前节点左右互换
        swap(root);

        //下面的也互换
        invertTree(root.getLeft());
        invertTree(root.getRight());

        return root;
    }

    /**
     * 注意: 这里交互不能直接传左右子树, 而应该传root, 因为要set, 而不是让左右子树互指
     */
    private void swap(TreeNode root){
        TreeNode tmp = root.getLeft();
        root.setLeft(root.getRight());
        root.setRight(tmp);
    }

}
