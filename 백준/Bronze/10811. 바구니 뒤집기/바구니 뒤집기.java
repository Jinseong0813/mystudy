import java.util.Arrays;
import java.util.Scanner;

//5 4 1: 1 2: 1 3: 1 4: 1 5: 1
//1 2 1: 2(1) 2: 1(1)
//3 4 3: 4(1) 4: 3(1)
//1 4 1: 3(1) 4: 2(1)
//2 2



public class Main   {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int [] ac = new int[N];
        for(int z=0; z<N; z++){
            ac[z] = z+1;
        }
        for(int o=0; o<M; o++){
            int i = sc.nextInt();
            int j = sc.nextInt();
            while(i<j){
                int chk = ac[i-1];
                ac[i-1] = ac[j-1];
                ac[j-1] = chk;
                i++;
                j--;
            }

        }
        for (int q=0; q<N; q++){
            System.out.print(ac[q] + " ");
        }


    }
}
