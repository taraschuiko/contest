import java.util.Scanner;

public class Task81 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = Integer.parseInt(scanner.nextLine());
        String [] s = scanner.nextLine().split("");
        int countToilets = 0;
        for (int i = 0; i < s.length; i++) {
            if (s[i].equals("T") && s[i + 1].equals("O") && s[i + 2].equals("I") && s[i + 3].equals("L") && s[i + 4].equals("E") && s[i + 5].equals("T")) {
                countToilets++;
                i += 6;
            }
        }
        System.out.println(countToilets >= k ? "YES" : "NO");
    }
}
