import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();
        if(num <= 0){
            System.out.print(false);
            return;
        }
        
        while(num % 3 == 0){
            num = num/3;
        }
        System.out.print(num == 1);
        
    }
}
