import java.util.Scanner;

public class Task21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int price = scanner.nextInt();
        int [] banknotes = {500, 200, 100, 50, 20, 10, 5, 2, 1};
        int banknotesCount = 0;
        for (int i = 0; i < banknotes.length; i++) {
            int currentBanknoteTimes = price / banknotes[i];

            if (currentBanknoteTimes >= 1) {
                banknotesCount += currentBanknoteTimes;
                price -= banknotes[i] * currentBanknoteTimes;
            }
        }
        System.out.println(banknotesCount);
    }
}
