//public class No_28_对称的二叉树 {
//    public boolean isSymmetric(TreeNode root) {
//        return root == null || helper(root.left, root.right);
//    }
//
//    private boolean helper(TreeNode left, TreeNode right) {
//        if (left == null && right == null) {
//            return true;
//        }
//        if (left == null || right == null || left.val != right.val) {
//            return false;
//        }
//        return helper(left.left, right.right) && helper(left.right, right.left);
//    }
//}
