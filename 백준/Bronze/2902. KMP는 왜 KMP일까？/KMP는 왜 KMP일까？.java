import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String T = sc.next();
        String [] arr = T.split("-");
        String a = "";
        for(int i=0; i<arr.length; i++) {
            arr[i] = arr[i].substring(0,1);
            a += arr[i];
        }
        System.out.println(a);
    }
}
