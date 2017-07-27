package me.alexssandroreis.hackranksolved.warmup;

import java.util.Scanner;

/**
 * Solution of Plus Minus Challenge
 */
public class PlusMinus {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        double totalPositive = 0.0;
        double totalNegative = 0.0;
        double totalZeros = 0.0;

        for (int i = 0; i < n; i++) {
            double number = scanner.nextInt();

            if (number > 0) {
                totalPositive++;
            } else if (number < 0) {
                totalNegative++;
            } else {
                totalZeros++;
            }
        }

        System.out.println(totalPositive / n);
        System.out.println(totalNegative / n);
        System.out.println(totalZeros / n);
    }
}
