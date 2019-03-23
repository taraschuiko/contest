import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] numbers = scanner.nextLine().split(" ");
        int sum = 0;
        for (int i = 0; i < 2; i++) {
            sum += Integer.parseInt(numbers[i]);
        }
        System.out.println(sum);
    }
}
