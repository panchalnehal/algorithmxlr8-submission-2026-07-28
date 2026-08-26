import java.util.*;

public class Main {
    // int addDigits(int num) {
    //     if (num == 0) {
    //         return 0;                        // zero is already a single digit
    //     }
    //     return 1 + (num - 1) % 9;           // digital root formula, no folding needed at all
    // }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();

        while(num > 9){
            long newNum = 0;
            while(num != 0){
                long digit = num % 10;
                newNum = newNum + digit;
                num = num/10;
            }
            num = newNum;
        }
        System.out.println(num);
        
    }
}