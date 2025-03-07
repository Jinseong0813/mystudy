import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int today = sc.nextInt(); // 오늘 날짜 끝자리
        int count = 0;

        // 다섯 개의 차량 번호 입력받기
        for (int i = 0; i < 5; i++) {
            if (sc.nextInt() == today) { // 오늘 날짜와 같다면 카운트 증가
                count++;
            }
        }

        System.out.println(count); // 결과 출력
        sc.close();
    }
}
