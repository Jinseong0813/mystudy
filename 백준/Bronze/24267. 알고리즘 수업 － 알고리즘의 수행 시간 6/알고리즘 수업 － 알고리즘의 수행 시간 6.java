import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        int sum =0;
//        for(int i=1; i<=n-2; i++){
//            for(int j=i+1; j<=n-1; j++){
//                for(int k=j+1; k<=n; k++){
//                   sum++;
//                }
//            }
//        }
//        System.out.println(sum + "\n" +3);
        System.out.println((n*(n-1)*(n-2))/6 + "\n" + 3);
    }
}
