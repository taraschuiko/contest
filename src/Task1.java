import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n = scanner.nextLine();
        for (int i = 0; i < n.length(); i++) {
            if (i == n.length()-1) {
                System.out.print(n.charAt(i));
            } else {
                System.out.print(n.charAt(i) + " ");
            }
        }
    }
}
