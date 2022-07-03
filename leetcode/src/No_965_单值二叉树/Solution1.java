package No_965_单值二叉树;

import datastructure.TreeNode;

import java.util.ArrayDeque;
import java.util.Deque;

class Solution1 {
    /**
     * 迭代法
     * @param root
     * @return
     */
    public boolean isUnivalTree(TreeNode root) {
        int val = root.val;
        Deque<TreeNode> d = new ArrayDeque<>();
        d.addLast(root);
        while (!d.isEmpty()) {
            TreeNode poll = d.pollFirst();
            if (poll.val != val) {
                return false;
            }
            if (poll.left != null) {
                d.addLast(poll.left);
            }
            if (poll.right != null) {
                d.addLast(poll.right);
            }
        }
        return true;
    }
}

