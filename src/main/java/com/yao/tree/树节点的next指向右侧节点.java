package com.yao.tree;

import com.yao.domain.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class 树节点的next指向右侧节点 {

    //
//
//

    /**
     * 填充每个节点的 next指针, 使其指向右侧节点.
     * 其实就是 层次遍历, 写的时候可以先把层次遍历的代码写出来, 然后再织入逻辑.
     *
     * 注意节点next的设置, 可以在while的下面, 创建一个临时节点, 用于next的指向;
     * 也可以在for内部, 设置next指向 q.peek(), 但是要注意不是最后一个节点,
     *     否则会出现上层节点指向下层节点的情况: 这个问题比较严重
     *     也有可能队列此时是空的, peek方法返回null——这时倒没太大问题
     * @param root
     * @return
     */
    public TreeNode connect(TreeNode root) {

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        while(!q.isEmpty()){
            int levelSize = q.size();

            for(int i = 0; i < levelSize; i++) {
                TreeNode node = q.poll();

                if(i < levelSize - 1){
                    node.setNext(q.peek());
                }

                if(node.getLeft() != null){
                    q.offer(node.getLeft());
                }

                if(node.getRight() != null){
                    q.offer(node.getRight());
                }
            }
        }

        return root;
    }

}
