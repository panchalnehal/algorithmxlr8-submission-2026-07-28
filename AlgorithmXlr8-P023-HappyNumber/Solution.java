import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        while(n != 1 && n != 4){
            int newNum = 0;
            while( n != 0){
                int digit = n % 10;
                newNum = newNum + digit*digit;
                n = n/10;
            }
            n = newNum;
        }
        System.out.print(n == 1);
    }
}
