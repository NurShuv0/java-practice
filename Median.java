import java.util.Arrays;

public class Median{

    public static int[] find_median(int[] nums, int k) {
        if (nums == null || nums.length == 0 || k <= 0 || k > nums.length) {
            return new int[0];
        }
        int[] window = new int[k];
        int[] medians = new int[nums.length - k + 1];
        for (int i = 0; i <= nums.length - k; i++) {
            System.arraycopy(nums, i, window, 0, k);
            medians[i] = calculate(window);
        }
        return medians;
    }
    private static int calculate(int[] w) {
        int[] sorted = Arrays.copyOf(w, w.length);
        Arrays.sort(sorted);
        int mid = sorted.length / 2;
        if (sorted.length % 2 == 0) {
            return (sorted[mid - 1] + sorted[mid]) / 2;
        } else {
            return sorted[mid];
        }
    }
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 8};
        int k = 3;
        int[] medians = find_median(nums, k);
        System.out.println("Result array " + Arrays.toString(medians));
    }
}