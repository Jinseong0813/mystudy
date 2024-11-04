import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int [] ac= new int[N];
        int count=0;
        for(int i=0;i<N;i++){
            ac[i]=sc.nextInt();

        }
        int v = sc.nextInt();
        for(int i=0;i<N;i++){
            if(ac[i]==v) {
                count++;
            }
        }
            System.out.println(count);



        }

    }
