import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] black = {1,1,2,2,2,8};

        int [] sum = new int[6];
        for(int i=0;i<6;i++){
            int white=sc.nextInt();
            sum[i] = black[i]-white;
        }
        for(int i=0;i<6;i++){
            System.out.print(sum[i]+" ");
        }
    }
}
