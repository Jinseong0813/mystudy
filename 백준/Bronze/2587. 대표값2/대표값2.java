
import java.util.Arrays;
import java.util.Scanner;
// 10 40 30 60 30
public class Main   {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] cs= new int[5];
        int sum =0;
        int avg =0;
        for(int i=0;i<5;i++){
            cs[i]=sc.nextInt();
        }
        for(int i=0;i<5;i++){
            sum+=cs[i];

        }
        Arrays.sort(cs);
        avg=sum/5;
        System.out.println(avg);
        System.out.println(cs[2]);


    }
}
