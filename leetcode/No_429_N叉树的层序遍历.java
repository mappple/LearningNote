import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class No_429_N叉树的层序遍历 {
    public List<List<Integer>> levelOrder(Node root) {
        if (root == null) {
            return new ArrayList<>();
        }

        List<List<Integer>> ans = new ArrayList<>();
        Queue<Node> queue = new ArrayDeque<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int cnt = queue.size();
            List<Integer> level = new ArrayList<>();
            for (int i = 0; i < cnt; ++i) {
                Node cur = queue.poll();
                level.add(cur.val);
                for (Node child : cur.children) {
                    queue.offer(child);
                }
            }
            ans.add(level);
        }
        return ans;
    }
}
