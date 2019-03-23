package eolymp;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count = 0;
        if (n > 0) {
            while (n > 0) {
                n /= 10;
                count++;
            }
            System.out.println(count);
        }
    }
}
