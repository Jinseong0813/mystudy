import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int A = T/300;
        int B = T%300/60;
        int C = T%300%60/10;

            if(T % 10 != 0){
                System.out.println(-1);
            }else{
                System.out.print(A + " " + B + " " + C);

            }
    }
}