import java.util.ArrayList;
import java.util.List;

class Node {
    public int val;
    public List<Node> children;

    public Node() {
    }

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }

    public class No_589_N_ary_Tree_Preorder_Traversal {
        List<Integer> res = new ArrayList<>();

        public List<Integer> preorder(Node root) {
            doNext(root);
            return res;
        }

        private void doNext(Node root) {
            if (root != null) {
                res.add(root.val);
                for (int i = 0; i < root.children.size(); i++) {
                    doNext(root.children.get(i));
                }
            }
        }
    }

}
