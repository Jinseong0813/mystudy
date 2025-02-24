import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        int day = sc.nextInt();
        String [] arr = {"SUN" ,"MON","TUE","WED","THU","FRI","SAT"};
        int sum =0;
        for(int i=1; i<month; i++){
            switch (i){
                case 4:
                case 6:
                case 9:
                case 11:
                    sum = 30;
                    break;
                case 2:
                    sum = 28;
                    break;
                default:
                    sum = 31;
            }
            day +=sum;
        }
        String rest = "";
        rest = arr[day%7];
        System.out.println(rest);

    }
}
