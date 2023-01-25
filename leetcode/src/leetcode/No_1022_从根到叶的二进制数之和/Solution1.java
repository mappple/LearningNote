package leetcode.No_1022_从根到叶的二进制数之和;

import datastructure.TreeNode;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 迭代解法
 */
class Solution1 {
    public int sumRootToLeaf(TreeNode root) {
        Deque<TreeNode> stack = new ArrayDeque<>();
        int val = 0, ret = 0;
        //先前访问的节点
        TreeNode prev = null;
        while (root != null || !stack.isEmpty()) {
            while (root != null) {
                val = (val << 1) | root.val;
                stack.push(root);
                root = root.left;
            }
            root = stack.peek();
            //判断左子树和右子树都已经访问
            if (root.right == null || root.right == prev) {
                //判断是叶子节点
                if (root.left == null && root.right == null) {
                    ret += val;
                }
                val >>= 1;
                stack.pop();
                prev = root;
                root = null;
            } else {
                root = root.right;
            }
        }
        return ret;
    }
}