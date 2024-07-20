package com.yao.util;

import com.yao.domain.LinkedNode;
import com.yao.domain.TreeNode;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Utils {

    public static String toString(LinkedNode head){
        LinkedNode tmp = head;
        StringBuilder res = new StringBuilder();
        int maxTimes = 15;
        int times = 0;
        while (tmp != null && times <= maxTimes){
            res.append(tmp.v + " -> ");
            tmp = tmp.next;
            times = times + 1;
        }

        return res.substring(0, res.length() - 4);
    }

    public static LinkedNode build(int ... vs){
        LinkedNode current = new LinkedNode(-1);
        LinkedNode tmp = current;

        for (int v : vs) {
            current.next = new LinkedNode(v);
            current = current.next;
        }

        return tmp.next;
    }

    /**
     * @return 1 ---> 2 ---> 3 ---> 4 ---> 5 ---> 6 ---> 7 ---> 8 ---> 9
     */
    public static LinkedNode build(){
        return build(1, 2, 3, 4, 5, 6, 7, 8, 9);
    }

    public static TreeNode tree(){
        return new TreeNode(1, new TreeNode(2, new TreeNode(4), new TreeNode(5)), new TreeNode(3, new TreeNode(6), new TreeNode(7)));
    }

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

    public static void printTree(TreeNode root){
        for (List<Integer> integers : traversal(root)) {
            System.out.println(integers);
        }
    }

    public static void main(String[] args) {
        int count = 100 * 10000;
        int seconds = 3600;

        System.out.println(count / seconds);
    }

}
