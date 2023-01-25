package leetcode.No_965_单值二叉树;

import datastructure.TreeNode;

class Solution {
    int val = -1;

    /**
     * 递归法
     * @param root
     * @return
     */
    public boolean isUnivalTree(TreeNode root) {
        if (val == -1) {
            val = root.val;
        }
        if (root == null) {
            return true;
        }
        if (root.val != val) {
            return false;
        }
        return isUnivalTree(root.left) && isUnivalTree(root.right);
    }
}

