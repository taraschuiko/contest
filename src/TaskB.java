import java.util.*;

public class TaskB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<Integer> numbers = new ArrayList<>();
        while (n > 0) {
            numbers.add(n % 10);
            n /= 10;
        }

        Collections.reverse(numbers);

        List<Integer> combinations = new ArrayList<>();

        List<Integer> currentDecimals;

        for (int i = 0; i < numbers.size(); i++) {
            currentDecimals = new ArrayList<>();
            String currentNum = "";
            for (int j = 0; j < numbers.size(); j++) {
                if (j != i) {
                    currentNum += numbers.get(j);
                    currentDecimals.add(numbers.get(j));
                }
            }
            combinations.add(Integer.parseInt(currentNum));
        }

        System.out.println(Collections.max(combinations));
    }
}
