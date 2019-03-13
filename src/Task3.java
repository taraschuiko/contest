import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int col = 0, num = 0;
        if(n == 1){
            col += 12;
        }else if(n >= 1){
            while(num <= n){
                col += 12;
                num++;
            }
        }
        System.out.println(col);
    }
}
