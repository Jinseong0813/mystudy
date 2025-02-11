import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = a*b;
        for(int i=0; i<5; i++){
             int N = sc.nextInt();
             if(c==N){
                 System.out.print("0" + " ");
             }else {
                 System.out.print((N-c)+ " ");
             }
        }
        sc.close();
    }
}