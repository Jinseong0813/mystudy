import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        String C = sc.next();
        String D = sc.next();

        String ab = A+B;
        String cd = C+D;
        long ans = Long.parseLong(ab) + Long.parseLong(cd);
        System.out.println(ans );
    }
}
