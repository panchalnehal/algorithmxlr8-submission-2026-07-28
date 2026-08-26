import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num <= 0) {
            System.out.print(false);
            return;
        }

        while( num != 1){
            if(num % 2 == 0){
                num = num/2;
            }else if(num % 3 == 0){
                num = num/3;
            }else if( num % 5 == 0){
                num = num/5;
            }else{
                break;
            }
        }
        System.out.print(num==1);
    }
}
