package me.alexssandroreis.hackranksolved.warmup;

import java.util.Scanner;

/**
 * Resolution of A very big sum
 */
public class AVeryBigSum {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long[] array = new long[n];
        for(int i = 0; i < n; i++){
            array[i] = in.nextLong();
        }
        long result = solve(n, array);
        System.out.println(result);
    }

    private static long solve(int n, long[] array) {
        long result = 0;

        for (int i = 0; i < n; i++) {
            result += array[i];
        }

        return result;
    }
}
