
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        String [] aa = new String[N];

        for(int i = 0;i < N;i++){
            aa[i] = sc.next();
        }
        char [] c = aa[0].toCharArray();

        for(int i = 1;i < N;i++){
            for(int j = 0; j< aa[0].length(); j++){
                if(c[j]!='?' && c[j]!=aa[i].charAt(j)){
                    c[j]='?';
                }
            }
        }
        for(int i = 0;i < aa[0].length();i++){
            System.out.print(c[i]);
        }

    }
}
