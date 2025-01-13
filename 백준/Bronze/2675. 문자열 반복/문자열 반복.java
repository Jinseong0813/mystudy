import java.awt.*;
import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T =  sc.nextInt();
        for(int i=0; i<T; i++){

            int R = sc.nextInt();
            String S = sc.next();

            for(int j=0; j<S.length(); j++){
                for(int z=0; z<R; z++){
                    System.out.print(S.charAt(j));
                }
            }
            System.out.println();
        }

    }
}