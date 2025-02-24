import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char [][] arr = new char [5][15];
        for(int i=0; i<5; i++){
            String line = sc.nextLine();
            Arrays.fill(arr[i], ' ');
            for(int j=0; j<line.length(); j++){
                arr[i][j] = line.charAt(j);
            }
        }
        for(int i=0; i<15; i++){
            for(int j=0; j<5; j++){
                if(arr[j][i] != ' '){
                    System.out.print(arr[j][i]);
                }
            }
        }
    }
}
