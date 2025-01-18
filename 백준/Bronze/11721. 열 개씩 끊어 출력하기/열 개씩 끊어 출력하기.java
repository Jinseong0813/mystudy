
import java.util.Scanner;


public class Main   {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String N = sc.next();
        //0~9 10~19 20~29 ....
        for(int i=0; i<N.length(); i++){
            // 0~9 10~19
            System.out.print(N.charAt(i));
            if(i%10==9){
                System.out.println();
            }
        }
    }
}
