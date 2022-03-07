public class No_504_Base_7 {

    public String convertToBase7(int num) {
        if (num == 0) {
            return "0";
        }
        boolean negative = num < 0;
        num = Math.abs(num);
        StringBuffer digits = new StringBuffer();
        while (num > 0) {
            digits.append(num % 7);
            num /= 7;
        }
        if (negative) {
            digits.append('-');
        }
        return digits.reverse().toString();
    }

    public static void main(String[] args) {
        No_504_Base_7 no_504_base_7 = new No_504_Base_7();
        int t1 = 100;
        int t2 = -7;
        System.out.println(no_504_base_7.convertToBase7(t1));
        System.out.println(no_504_base_7.convertToBase7(t2));
    }
}
