public class PrintUtils {

    private static final String template = "node%d(value=%d)--->";

    public static void printThisList(ListNode node) {
        StringBuilder sb = new StringBuilder();
        int index = 0;
        while (node!= null) {
            sb.append(String.format(template, index++, node.val));
            node = node.next;
        }
        sb.append("null");
        System.out.println(sb);
    }
}
