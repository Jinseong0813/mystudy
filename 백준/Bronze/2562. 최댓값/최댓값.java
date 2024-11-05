import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int [] ac= new int[9];
        int count1 = 0;
        for(int i=0;i<9;i++){
            ac[i]=sc.nextInt();
        }
        int max = ac[0];
        int count=1;
        for(int i=1;i<9; i++){
            if(ac[i]>max){
                max = ac[i];
                count=i+1;
            }

        }
        System.out.println(max);
        System.out.println(count);
        }

    }
