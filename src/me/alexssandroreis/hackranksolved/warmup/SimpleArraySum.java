package me.alexssandroreis.hackranksolved.warmup;

import java.util.Scanner;

/**
 * Resolution of Simple Array Sum
 */
public class SimpleArraySum {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] array = new int[n];
        for(int i = 0; i < n; i++){
            array[i] = in.nextInt();
        }
        int result = solve(n, array);
        System.out.println(result);
    }

    private static int solve(int n, int[] array) {
        int result = 0;

        for (int i = 0; i < n; i++) {
            result += array[i];
        }

        return result;
    }
}
