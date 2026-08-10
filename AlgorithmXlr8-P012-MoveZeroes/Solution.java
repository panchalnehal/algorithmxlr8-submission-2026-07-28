import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] nums = new long[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextLong();
        }
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] != 0) {
                long temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}