import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        long y = x;
        if(x < 0){
            System.out.println(false);
            return;
        }
        long newNum = 0;
        while(x != 0){
            long digit = x % 10;
            newNum = newNum * 10 + digit;
            x = x / 10;
        }

        if( y == newNum){
            System.out.print(true);
        }else{
            System.out.print(false);
        }
    }
}
