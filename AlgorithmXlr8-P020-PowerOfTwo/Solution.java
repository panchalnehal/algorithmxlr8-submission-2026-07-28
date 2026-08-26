// import java.util.*;

// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         long num = sc.nextLong();

//         boolean x = num > 0;
        
//         while(num >1){
//             if(num % 2 == 0){
//                 num = num/2;
//             }else{
//                 x = false;
//                 break;
//             }
//         }
//         System.out.print(x);
//     }
// }

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();

        if (num <= 0) {
            System.out.println(false);
            return;
        }

        while (num % 2 == 0) {
            num = num / 2;
        }

        System.out.println(num == 1); // basically comparing with the number , is number equal to 1 or not 
    }
}
