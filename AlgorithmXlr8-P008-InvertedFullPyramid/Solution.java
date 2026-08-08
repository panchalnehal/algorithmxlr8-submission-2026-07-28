import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
            for(int j = 0; j<i; j++){
                System.out.print(" ");
            }
            for(int k = 1; k<= (n*2-i*2-1); k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
