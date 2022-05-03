import java.util.ArrayDeque;
import java.util.Deque;

public class No_388_文件的最长绝对路径 {
    public int lengthLongestPath(String input) {
        int n = input.length();
        int pos = 0;
        int ans = 0;
        Deque<Integer> stack = new ArrayDeque<>();

        while (pos < n) {
            /* 检测当前文件的深度 */
            int depth = 1;
            while (pos < n && input.charAt(pos) == '\t') {
                pos++;
                depth++;
            }
            /* 统计当前文件名的长度 */
            boolean isFile = false;
            int len = 0;
            while (pos < n && input.charAt(pos) != '\n') {
                if (input.charAt(pos) == '.') {
                    isFile = true;
                }
                len++;
                pos++;
            }
            /* 跳过当前的换行符 */
            pos++;
            //回退操作
            System.out.println("current file depth = " + depth + " path depth = " + stack.size());
            while (stack.size() >= depth) {
                System.out.println("path depth >= depth start pop");
                stack.pop();
                System.out.println("end pop path depth = " + stack.size());
            }
            //说明节点深度大于当前路径的深度
            if (!stack.isEmpty()) {
                len += stack.peek() + 1;
            }
            if (isFile) {
                System.out.println("current len = " + len + " ans = " + ans);
                ans = Math.max(ans, len);
            } else {
                System.out.println("not file, and path");
                stack.push(len);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        String t = "dir\n\tsubdir1\n\t\tfile1.ext\n\t\tsubsubdir1\n\tsubdir2\n\t\tsubsubdir2\n\t\t\tfile2.ext";

        System.out.println(new No_388_文件的最长绝对路径().lengthLongestPath(t));
    }
}
