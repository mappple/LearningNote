package leetcode.No_1022_从根到叶的二进制数之和;

import datastructure.TreeNode;

/**
 * 递归解法
 */
class Solution {
    public int sumRootToLeaf(TreeNode root) {
        return dfs(root, 0);
    }

    private int dfs(TreeNode root, int val) {
        if (root == null) {
            return 0;
        }
        //整体左移（腾出最后一位），然后将节点的值放置最低位来得到新的值
        val = (val << 1) | root.val;
        if (root.left == null && root.right == null) {
            return val;
        }
        return dfs(root.left, val) + dfs(root.right, val);
    }
}