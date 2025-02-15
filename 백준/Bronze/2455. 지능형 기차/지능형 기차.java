
import java.util.Scanner;
//0 32
//3 13
//28 25
//39 0

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] people= new int[5];
        int sum=0;
        int max=0;

        for (int i=0; i<4; i++){
            int inner = sc.nextInt();
            int outer = sc.nextInt();
            sum = sum+(outer-inner);
            people[i]=sum;
            if(people[i]>max){
                max = people[i];
               }
        }
        System.out.println(max);
        
    }
}
