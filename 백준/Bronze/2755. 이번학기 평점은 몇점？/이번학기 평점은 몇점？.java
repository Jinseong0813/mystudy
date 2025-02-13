import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        double score = 0.0;
        double sum = 0.0;
        double avg = 0.0;
        int totalpoint = 0;
        double totalsum = 0.0;
        for (int i = 0; i < N; i++) {
            String subject = sc.next();
            int point = sc.nextInt();
            String grade = sc.next();
            switch (grade) {
                case "A+":
                    score = 4.3;
                    break;
                case "A0":
                    score = 4.0;
                    break;
                case "A-":
                    score = 3.7;
                    break;
                case "B+":
                    score = 3.3;
                    break;
                case "B0":
                    score = 3.0;
                    break;
                case "B-":
                    score = 2.7;
                    break;
                case "C+":
                    score = 2.3;
                    break;
                case "C0":
                    score = 2.0;
                    break;
                case "C-":
                    score = 1.7;
                    break;
                case "D+":
                    score = 1.3;
                    break;
                case "D0":
                    score = 1.0;
                    break;
                case "D-":
                    score = 0.7;
                    break;
                case "F":
                    score = 0.0;
                    break;
            }
            totalsum += score * point;
            totalpoint += point;
        }
        avg = totalsum / totalpoint;
        System.out.printf("%.2f", avg);

    }
}