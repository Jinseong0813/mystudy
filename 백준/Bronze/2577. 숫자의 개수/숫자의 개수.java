import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A,B,C;
        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        int sum = A*B*C;
        int [] counts = new int[10];
        while(sum!=0){
            counts[sum%10]++;
            sum/=10;
        }
        for (int i = 0; i < counts.length; i++) {
            System.out.println(counts[i]);
        }

    }
}