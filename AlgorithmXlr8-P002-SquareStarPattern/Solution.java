import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // Write your solution here.
        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++ ){
                System.out.print("*");
            }
            System.out.println();
        }
        // Print an n x n square of stars, one row per line.
    }
}
