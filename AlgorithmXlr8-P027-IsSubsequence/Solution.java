import java.util.*;

public class Main {
    public static boolean isSubsequence(String s, String t){
        char[] schar = s.toCharArray();
        char[] tchar = t.toCharArray();

        int lastIndex = -1;

        for(int i = 0; i<schar.length; i++){
            boolean found = false;
            for(int j = 0; j<tchar.length; j++ ){
                if(schar[i] == tchar[j]){
                    lastIndex = j;
                    found = true;
                    break;
                }
            }
            if(!found){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();
        System.out.print(isSubsequence(s,t));
    }
}
