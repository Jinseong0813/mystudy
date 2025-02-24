import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int [] price = new int [T];
        int maxprice = 0;
        for(int i = 0; i < T; i++ ){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int max = a;
            if(a == b && b == c){
                price[i] = 10000+ (a * 1000);
            }else if(a== b || b==c ){
                price[i] = 1000+ (b * 100);
            }else if(a==c ) {
                price[i] = 1000 + (c * 100);
            }else {
                if(max<b){
                    max = b;
                }
                if(max<c){
                    max = c;
                }
                price[i]= max*100;
            }
        }
        for(int i = 0; i < T; i++ ){
            if(price[i]>maxprice){
                maxprice = price[i];
            }
        }
        System.out.println(maxprice);
    }
}
