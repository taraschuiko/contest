import java.util.Scanner;

public class Task31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String [] gives = scanner.nextLine().split("");
        int K = 0;
        int V = 0;
        int Kgives = 0;
        int Vgives = 0;
        for (int i = 0; i < n; i++) {
            switch (gives[i]) {
                case "K": Kgives++; break;
                case "V": Vgives++; break;
            }

            if (Kgives >= 11 && Kgives - Vgives >= 2) {
                K++;
                Kgives = 0;
                Vgives = 0;
            }

            if (Vgives >= 11 && Vgives - Kgives >= 2) {
                V++;
                Kgives = 0;
                Vgives = 0;
            }
        }
        System.out.println(K + ":" + V);
        if (Kgives != 0 || Vgives != 0) {
            System.out.println(Kgives + ":" + Vgives);
        }
    }
}
