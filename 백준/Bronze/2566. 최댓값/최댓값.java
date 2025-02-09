import java.util.Scanner;

public class Main   {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][] ac = new int [9][9];
        int max=0;
        int a=1;
        int b=1;
        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                ac[i][j] = sc.nextInt();
            }
        }
        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                if(ac[i][j]>max){
                    max = ac[i][j];
                    a = i+1;
                    b = j+1;
                }
            }
        }
        sc.close();
        System.out.println(max);
        System.out.println(a + " " + b);
    }
}
