import java.awt.*;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] a = new int[3];
        for (int i = 0; i < 3; i++) {
            a[i] = scanner.nextInt();
        }

        int [] c = new int[3];
        for (int i =0; i<3; i++){
            c[i] = scanner.nextInt();
        }
            //b.x = c.x-a.z
            //b.y = c.y/a.y
            //b.z = c.z-a.x
        int bx = c[0] - a[2];
        int by = c[1] / a[1];
        int bz = c[2] - a[0];

        System.out.println(bx + " " + by + " " + bz

        );
    }
}