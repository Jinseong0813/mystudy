import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int [] ac = new int[N];
        int M = sc.nextInt();
        for (int i=0;i<N;i++){
            ac[i] = 0;
        }
        for(int p=0;p<M;p++){
            int i=sc.nextInt();
            int j=sc.nextInt();
            int k=sc.nextInt();
            for (int num =i; num<=j; num++) {
                ac[num-1]=k;
            }
        }
        for(int i=0;i<N;i++){
            System.out.print(ac[i]+" ");
        }

        }

    }
