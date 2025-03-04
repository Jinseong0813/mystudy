import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int max_x = -10001;
        int max_y = -10001;
        int min_x = 10001;
        int min_y = 10001;
        for(int i = 0; i < N; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            if( max_x < x ){
                max_x = x;
            }
            if( max_y < y ){
                max_y = y;
            }
            if( min_x > x ){
                min_x = x;
            }
            if( min_y > y ){
                min_y = y;
            }
        }
        if(N==1){
            System.out.println("0");
        }else {
            int ans = (max_x - min_x) * (max_y - min_y);
            System.out.println(ans);
        }
    }
}
