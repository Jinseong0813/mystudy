import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i<T; i++){
            int A = sc.nextInt();
            int B = sc.nextInt();
            if (0<A && 10>A && 10>B && B>0) {
                System.out.println(A + B);
            }
        }
    }
}