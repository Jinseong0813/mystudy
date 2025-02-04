import java.util.Scanner;

public class Main   {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String N = sc.next();
        int cnt =0;
        int cut=1;
        for(int i=0; i<N.length(); i++) {
            if(N.charAt(i)==N.charAt(N.length()-cut)) {
                 cnt++;
            }
            cut++;
        }
        if(cnt==N.length()) {
            System.out.println("1");
        }else {
            System.out.println("0");
        }
    }
}
