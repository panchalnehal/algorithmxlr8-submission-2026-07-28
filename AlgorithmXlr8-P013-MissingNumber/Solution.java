import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] nums = new long[n];
        for (int i = 0; i < n; i++) nums[i] = sc.nextLong();

        // Arrays.sort(nums);
        // for(int i = 0; i<n; i++){
        //     if(nums[i] != i){
        //         System.out.print(i);
        //     }

        long total = (n*(n+1))/2;
        long sum = 0;
        for(long num : nums){
            sum += num;
        }
        System.out.print(total-sum);
    }
}
