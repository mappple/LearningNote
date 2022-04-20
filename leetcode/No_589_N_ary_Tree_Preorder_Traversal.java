import java.util.ArrayList;
import java.util.List;

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

