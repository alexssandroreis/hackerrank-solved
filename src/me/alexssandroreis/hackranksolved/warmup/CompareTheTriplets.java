package me.alexssandroreis.hackranksolved.warmup;

import java.util.Scanner;

/**
 * Resolution of Compare The Triplets challenge
 */
public class CompareTheTriplets {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a0 = in.nextInt();
        int a1 = in.nextInt();
        int a2 = in.nextInt();
        int b0 = in.nextInt();
        int b1 = in.nextInt();
        int b2 = in.nextInt();
        int[] result = solve(a0, a1, a2, b0, b1, b2);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
        }
        System.out.println("");
    }

    private static int[] solve(int a1, int a2, int a3, int b1, int b2, int b3) {
        int[] result = new int[2];

        result = validateResult(a1, b1, result);
        result = validateResult(a2, b2, result);
        result = validateResult(a3, b3, result);

        return result;
    }

    private static int[] validateResult(int a, int b, int[] result) {
        if (a > b) {
            result[0]++;
        } else if (a < b) {
            result[1]++;
        }

        return result;
    }
}
