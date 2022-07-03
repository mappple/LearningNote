public class No_11_旋转数组的最小数字 {
    public int minArray(int[] numbers) {
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < numbers[i - 1]) {
                return numbers[i];
            }
        }
        return numbers[0];
    }

    public static void main(String[] args) {
        int[] n = {3, 4, 5, 1, 2};
        System.out.println(new No_11_旋转数组的最小数字().minArray(n));
    }
}
