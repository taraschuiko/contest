package dragon;

import java.util.Scanner;

public class DragonTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи кількість голів");
        int heads = Integer.parseInt(scanner.nextLine());
        System.out.println("Введи кількість хвостів");
        int tails = Integer.parseInt(scanner.nextLine());

        Dragon dragon = new Dragon(heads, tails);

        if (dragon.getHeads() %2 != 0 && dragon.getTails() == 0) {
            System.out.println("Його неможливо вбити");
            return;
        } else {
            while (dragon.getHeads() > 0 || dragon.getTails() > 0) {
                if (dragon.getTails() %2 != 0) {
                    dragon.removeTail();
                }

                if (dragon.getHeads() %2 != 0) {
                    dragon.removeTwoTails();
                }

                if ((dragon.getTails() / 2) %2 == 0) {
                    while (dragon.getTails() > 0) {
                        dragon.removeTwoTails();
                    }

                    while (dragon.getHeads() > 0) {
                        dragon.removeTwoHeads();
                    }
                } else {
                    dragon.removeTail();
                }
            }
        }

        System.out.println("Кількість ходів - " + dragon.getMoves());
    }
}
