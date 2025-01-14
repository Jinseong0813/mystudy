import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N,A,x,y,z;
        int count=0;
        N = sc.nextInt();
        A=N;
        while (true) {
            x=A/10;
            y=A%10;
            z=x+y;
            if(z>=10){
                z=z%10;
            }
            A=y*10+z;
            count++;
            if(A==N || N==0){
                break;
            }
        }
        System.out.println(count);
    }
}