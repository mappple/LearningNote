package No_6079_价格减免;

import java.util.Arrays;

class Solution {
    public String discountPrices(String sentence, int discount) {
        String[] s = sentence.split(" ");
        for (int i = 0; i < s.length; i++) {
            String sub = s[i].substring(1);
            if (s[i].startsWith("$") && !sub.isEmpty() && !sub.contains("$")) {
                try {
                    double m = Double.parseDouble(sub);
                    double dis = m * (1 - discount / 100.0);
                    s[i] = "$" + String.format("%.2f", dis);
                } catch (NumberFormatException e) {

                }
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < s.length; i++) {
            stringBuilder.append(s[i]);
            if (i != s.length - 1) {
                stringBuilder.append(" ");
            }
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        String sentence = "f32eir5f6hlmmtnlq$zno3zbl5pr26b1xmet6q3rjzs422zqzsezpgi4jqx3h0olb428pk95qndkfz8hereio$2ewx0cnqlvnb6nl$$8iny7t4aemhnqzz6971rnq7pha97e9lf16227j5l2033pnddk $3513024 $516863 $604 $9128265 $945728 $nbf 5az21pm0tj $";

        int discount = 26;
        System.out.println(new Solution().discountPrices(sentence, discount));
    }
}