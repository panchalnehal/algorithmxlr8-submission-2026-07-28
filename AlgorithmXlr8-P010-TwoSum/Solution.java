import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long target = sc.nextLong();
        long[] nums = new long[n];
        for (int i = 0; i < n; i++) nums[i] = sc.nextLong();
        for(int i = 0; i<n ; i++){
            for(int j = i+1; j<n; j++){
                if(nums[i] + nums[j] == target){
                    System.out.println(i + " " + j);
                }
            }
        }

    }
}
