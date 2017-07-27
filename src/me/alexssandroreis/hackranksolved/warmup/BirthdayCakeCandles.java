package me.alexssandroreis.hackranksolved.warmup;

import java.util.Scanner;

/**
 * Solution of Birthday Cake Candles challenge
 */
public class BirthdayCakeCandles {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] candles = new int[n];
        for(int i = 0; i < n; i++){
            candles[i] = scanner.nextInt();
        }

        int result = solve(candles);

        System.out.println(result);
    }

    private static int solve(int[] candles) {
        int result = 0;
        int tallestCandle = 0;

        for (int i = 0; i < candles.length; i++) {

            if (tallestCandle < candles[i]) {
                tallestCandle = candles[i];
                result = 0;
            }

            if (tallestCandle == candles[i]) {
                result++;
            }
        }

        return result;
    }
}
