import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][] arr =new int[5][4];
        int [] sum = new int [5];
        for(int i=0; i<5; i++){
            for(int j=0; j<4; j++){
                arr[i][j] = sc.nextInt();
                sum[i] += arr[i][j];
            }
        }
        int max = sum[0], dab=1;
        for(int i=1; i<5; i++){
            if(sum[i] > max){
                max = sum[i];
                dab = i+1;
            }
        }
        System.out.println(dab + " " + max);
    }
}
