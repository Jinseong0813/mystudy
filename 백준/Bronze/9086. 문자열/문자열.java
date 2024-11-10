import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S;
        String C;
        int T = sc.nextInt();
        sc.nextLine();
        for (int i=0; i<T; i++) {
            String A = sc.nextLine();
            if(A.matches("[A-Z]+")){
                S= A.substring(0,1);
                C= A.substring(A.length()-1);
                System.out.println(S+C);
            }
        }
    }
    }
