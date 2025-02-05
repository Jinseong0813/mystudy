import java.util.Scanner;

//2
//6 12 10 -> 402
//30 50 72 -> 1203


public class Main   {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T  = sc.nextInt();
        for(int i=0; i<T; i++){
            int H = sc.nextInt(); // 10
            int W = sc.nextInt(); // 6
            int N = sc.nextInt(); // 12
            if(N%H==0){
                System.out.println(H*100 + N/H);
            }else {
                System.out.println((N%H)*100 + (N/H)+1);
            }

        }

    }
}
