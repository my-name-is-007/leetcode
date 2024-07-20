package com.yao.domain;

public class TreeNode {

    int v;
    TreeNode left;
    TreeNode right;

    TreeNode next;

    public TreeNode(int v) {
        this.v = v;
    }

    public TreeNode(int v, TreeNode left, TreeNode right) {
        this.v = v;
        this.left = left;
        this.right = right;
    }

    public int getV() {
        return v;
    }

    public void setV(int v) {
        this.v = v;
    }

    public TreeNode getLeft() {
        return left;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    public TreeNode getRight() {
        return right;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }

    public TreeNode getNext() {
        return next;
    }

    public void setNext(TreeNode next) {
        this.next = next;
    }

}
