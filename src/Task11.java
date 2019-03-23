import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [] cookies = new int[n];
        for (int i = 0; i < n; i++) {
            cookies[i] = scanner.nextInt();
        }
        int canEat = 0;
        for (int i = 0; i < n; i++) {
            canEat += cookies[i] - 1;
        }
        System.out.println(canEat);
    }
}
