import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [][] food = new int[n][3];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                food[i][j] = scanner.nextInt();
            }
        }
        int distrust = 0;
        int a = 40;
        int b = 30;
        int c = 75;
        for (int i = 0; i < n; i++) {
            distrust += Math.abs(a - food[i][0]) + Math.abs(b - food[i][1]) + Math.abs(c - food[i][2]);
        }
        System.out.println(distrust);
    }
}
