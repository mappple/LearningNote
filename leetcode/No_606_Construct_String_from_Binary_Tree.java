import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.Set;

public class No_606_Construct_String_from_Binary_Tree {

    /**
     * 递归
     *
     * @param root
     * @return
     */
    public String tree2str(TreeNode root) {
        if (root == null) {
            return "";
        }
        //如果当前节点没有孩子，那我们不需要在节点后面加上任何括号；
        if (root.left == null && root.right == null) {
            return Integer.toString(root.val);
        }
        //如果当前节点只有左孩子，那我们在递归时，只需要在左孩子的结果外加上一层括号，而不需要给右孩子加上任何括号；
        if (root.right == null) {
            return root.val + "(" + tree2str(root.left) + ")";
        }
        //如果当前节点只有右孩子，那我们在递归时，需要先加上一层空的括号‘()’ 表示左孩子为空，再对右孩子进行递归，并在结果外加上一层括号。
        //如果当前节点有两个孩子，那我们在递归时，需要在两个孩子的结果外都加上一层括号；
        return root.val + "(" + tree2str(root.left) + ")(" + tree2str(root.right) + ")";
    }

    /**
     * 迭代
     * @param root
     * @return
     */
    public String tree2str2(TreeNode root) {
        StringBuffer ans = new StringBuffer();
        Deque<TreeNode> stack = new ArrayDeque<>();
        stack.push(root);
        Set<TreeNode> visited = new HashSet<>();
        while (!stack.isEmpty()) {
            TreeNode node = stack.peek();
            if (!visited.add(node)) {
                if (node != root) {
                    ans.append(")");
                }
                stack.pop();
            } else {
                if (node != root) {
                    ans.append("(");
                }
                ans.append(node.val);
                if (node.left == null && node.right != null) {
                    ans.append("()");
                }
                if (node.right != null) {
                    stack.push(node.right);
                }
                if (node.left != null) {
                    stack.push(node.left);
                }
            }
        }
        return ans.toString();

    }
}
