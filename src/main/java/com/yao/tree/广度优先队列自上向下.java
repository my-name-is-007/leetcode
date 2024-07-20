package com.yao.tree;

import com.yao.domain.TreeNode;
import com.yao.util.Utils;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class 广度优先队列自上向下 {

    public static List<List<Integer>> traversal(TreeNode root) {
        List<List<Integer>> res = new LinkedList<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()){
            //当前层遍历次数、当前层结果
            int levelNodeNums = q.size();
            List<Integer> levelNodes = new LinkedList<>();

            for (int i = 0; i < levelNodeNums; i++) {
                TreeNode node = q.poll();
                levelNodes.add(node.getV());

                //左节点入队列.
                if(node.getLeft() != null){
                    q.add(node.getLeft());
                }

                //右节点入队列.
                if(node.getRight() != null){
                    q.add(node.getRight());
                }
            }

            res.add(levelNodes);
        }

        return res;
    }

    public static void main(String[] args) {
        TreeNode root = Utils.tree();
        Utils.printTree(root);
    }

}
