import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][] ac = new int [3][4];
        String [] result = {"D", "C", "B", "A", "E"};
        int sum = 0;
        for(int i=0; i < 3; i++) {
            int sum1=0;
            for(int j = 0; j < 4; j++) {
                ac [i][j] = sc.nextInt();
                sum1 += ac[i][j];

//                int yut = sc.nextInt();
//                sum += yut;
            }
//            if(sum == 3)
//                System.out.println("A");
//            else if(sum == 2)
//                System.out.println("B");
//            else if(sum == 1)
//                System.out.println("C");
//            else if(sum == 0)
//                System.out.println("D");
//            else if(sum == 4)
//                System.out.println("E");
//            sum = 0;
            System.out.println(result[sum1]);
        }
        sc.close();
    }
}