import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  // N 입력 받기

        for (int i = n; i > 0; i--) {  // i를 N부터 1까지 감소
            for (int j = 0; j < i; j++) {  // i번만큼 '*' 출력
                System.out.print("*");
            }
            System.out.println();  // 줄바꿈
        }
    }
}
