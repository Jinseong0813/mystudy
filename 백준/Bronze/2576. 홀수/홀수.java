
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int min= Integer.MAX_VALUE;
        int sum=0;
        int cnt = 0;
        int [] arr = new int[8];
        for(int i=0; i<7; i++){
            arr[i]=sc.nextInt();
            if(arr[i]%2!=0){
                sum+=arr[i];
                cnt++;
                if(arr[i]<min){
                    min=arr[i];
                }
            }
        }
        if(cnt ==0){
            System.out.println(-1);
        }else{
            System.out.println(sum);
            System.out.println(min);
        }
    }
}
