import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String N = sc.next();
        int sum = 0;
        for(int i=0; i<n; i++){
            sum += Integer.parseInt(String.valueOf(N.charAt(i)));
        }
        System.out.println(sum);
    }
    }
