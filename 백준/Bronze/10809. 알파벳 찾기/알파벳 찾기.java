import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int[] C = new int[26];
        
        
        Arrays.fill(C, -1);
        
        
        for (int i = 0; i < S.length(); i++) {
            char currentChar = S.charAt(i);
            if (currentChar >= 'a' && currentChar <= 'z') {
                int index = currentChar - 'a';
                
                if (C[index] == -1) {
                    C[index] = i; 
                }
            }
        }
        
        
        for (int i = 0; i < C.length; i++) {
            System.out.print(C[i]);
            if (i < C.length - 1) {
                System.out.print(" ");
            }
        }
    }
}
