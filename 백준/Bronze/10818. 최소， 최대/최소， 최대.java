import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int [] ac= new int[N];
        for(int i=0;i<N;i++){
            ac[i]=sc.nextInt();
        }
        int max = ac[0];
        int min = ac[0];
        for(int i=1;i<N;i++){
            if(ac[i]>max){
                max = ac[i];
            }
            if(ac[i]<min){
                min = ac[i];
            }
        }
        System.out.println(min + " " + max);
        }

    }
