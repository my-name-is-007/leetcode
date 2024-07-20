package com.yao.tree;


import com.yao.domain.TreeNode;
import com.yao.util.Utils;

public class 深度优先之递归实现 {

    public static void traversal1(TreeNode root) {
        if(root == null){
            return ;
        }

        ///在这里输出: 先序遍历
        System.out.print(root.getV() + " ---> ");
        traversal1(root.getLeft());
        traversal1(root.getRight());
    }

    public static void traversal2(TreeNode root) {
        if(root == null){
            return ;
        }

        traversal2(root.getLeft());
        //在这里输出: 中序遍历
        System.out.print(root.getV() + " ---> ");
        traversal2(root.getRight());
    }

    public static void traversal3(TreeNode root) {
        if(root == null){
            return ;
        }

        traversal3(root.getLeft());
        traversal3(root.getRight());
        //在这里输出: 后顺遍历
        System.out.print(root.getV() + " ---> ");
    }

    public static void main(String[] args) {
        traversal1(Utils.tree());
        System.out.println();

        traversal2(Utils.tree());
        System.out.println();

        traversal3(Utils.tree());
        System.out.println();
    }

}
