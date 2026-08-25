import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.next();
        char[] x = num.toCharArray();

        for(int i = 0; i< x.length; i++){
            if(x[i] != '9'){
                x[i] = '9';
                break;
            }
        }
        System.out.println(new String(x));
    }
}
