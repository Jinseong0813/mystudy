import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        //세번째자리
        int a_three=a/100;
        int b_three=b/100;
        //두번째 자리
        int a_two=a%100/10;
        int b_two=b%100/10;
        //첫번째 자리
        int a_one=a%10;
        int b_five=b%10;
        int sum1 = a_one*100 + a_two*10 + a_three;
        int sum2 = b_five*100 + b_two*10 + b_three;
        if (sum1 > sum2 ){
            System.out.println(sum1);
        }else {
            System.out.println(sum2);
        }

        //두번째방법-문자열 변환
//        String str_a= Integer.toString(a);
//        String str_b= Integer.toString(b);
//        //0~3전. 0, 1, 2
//        //2 1 0
//        for (int i = str_a.length()-1; i >=0 ; i--) {
//            if(str_a.charAt(i)>str_b.charAt(i)){
//                System.out.print(str_a.charAt(i));
//            }else{
//                System.out.print(str_b.charAt(i));
//            }
//        }

    }


}