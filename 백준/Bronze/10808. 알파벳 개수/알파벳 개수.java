
import java.util.Arrays;
import java.util.Scanner;
// 10 40 30 60 30
public class Main   {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char [] av = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        String N = sc.next();
        for (int i = 0; i < av.length; i++) {
            int cnt =0;
            for(int j=0;j<N.length();j++){
                if(N.charAt(j)==av[i]) {
                    cnt++;
                }
            }
            System.out.print(cnt+" ");

        }

    }
}
