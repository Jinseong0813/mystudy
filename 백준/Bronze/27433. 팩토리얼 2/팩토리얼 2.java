import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Long result= 1L;
        for(int i=N;i>0;i--){
            result = result*i;
        }
        System.out.println(result);
    }
}
