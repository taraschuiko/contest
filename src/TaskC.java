import java.util.Scanner;

public class TaskC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int s = scanner.nextInt();
        int n = scanner.nextInt();
        int [] things = new int[n];
        for (int i = 0; i < n; i++) {
            things[i] = scanner.nextInt();
        }

        int backpackWeight = 0;
        int baggageWeight = 0;

        for (int i = 0; i < n; i++) {
            if (backpackWeight + things[i] <= s) {
                backpackWeight += things[i];
            } else {
                baggageWeight += things[i];
            }
        }

        System.out.println(backpackWeight + " " + baggageWeight);
    }
}
