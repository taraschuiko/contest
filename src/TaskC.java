import java.util.Scanner;

public class TaskC {
    public static Boolean checkSimple(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n %i == 0) {
                count++;
            }
        }

        if (count <= 2) {
            return true;
        }
        return false;
    }

    public static Boolean checkDividersSimple(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        if (checkSimple(count)) {
            return true;
        }
        return false;
    }

    public static Integer countFunny(int l, int r) {
        int count = 0;
        for (int i = l; i <= r; i++) {
            if (!checkSimple(i) && checkDividersSimple(i)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Number 1: ");
        int l = Integer.parseInt(scanner.nextLine());
        System.out.println("Number 2: ");
        int r = Integer.parseInt(scanner.nextLine());
        System.out.println("Funny numbers: " + countFunny(l, r));
    }
}
