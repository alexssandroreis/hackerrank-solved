package me.alexssandroreis.hackranksolved.warmup;

import java.util.Scanner;

/**
 * Solution of Staircase Challenge
 */
public class Staircase {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            StringBuilder line = new StringBuilder();
            for (int f = 0; f < n; f++) {
                if (f + 1 == n - i || f >= n - i) {
                    line.append("#");
                } else {
                    line.append(" ");
                }
            }

            System.out.println(line.toString());
        }
    }
}
