package com.yao.tree;

import com.yao.domain.TreeNode;

import java.util.List;
import java.util.Stack;

public class 深度优先之栈实现 {

    public List<Integer> traversal(TreeNode root) {

        Stack<TreeNode> stack = new Stack<>();

        TreeNode cur = root;

        while(true){

            //左子树不停入栈
            while(cur != null){
                //输出加在这是先序遍历
                stack.push(cur);
                cur = cur.getLeft();
            }


            TreeNode left = stack.pop();
            //输出加在这是中序遍历
            cur = left.getRight();

            if(cur == null && stack.isEmpty()){
                break ;
            }
        }

        return null;
    }

}
