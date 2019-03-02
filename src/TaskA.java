import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TaskA {
    public static void main(String[] args) {
        List<Float> pointsList = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        int t = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < t; i++) {
            String[] read = scanner.nextLine().split(" ");
            Integer[] data = new Integer[4];
            for (int j = 0; j < 4; j++) {
                data[j] = Integer.parseInt(read[j]);
            }

            float points = 0;
            for (int j = 0; j < data[1]; j++) {
                points += 5;
            }
            for (int j = 0; j < data[2]; j++) {
                points += 3;
            }
            for (int j = 0; j < data[3]; j++) {
                points += 1;
            }
            points /= data[0];
            pointsList.add(points);
        }

        for (int i = 0; i < pointsList.size(); i++) {
            System.out.println(String.format("%.2f", pointsList.get(i)));
        }
    }
}
