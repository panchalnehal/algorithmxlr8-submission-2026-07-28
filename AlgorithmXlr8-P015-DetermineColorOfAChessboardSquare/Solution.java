import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String coordinates = sc.next();

        int row = coordinates.charAt(0) - 'a';
        int col = coordinates.charAt(1) - '1';

        int sum = row + col;
        if(sum % 2 == 1){
            System.out.print("White");
        }else{
            System.out.print("Black");
        }

    }
}
