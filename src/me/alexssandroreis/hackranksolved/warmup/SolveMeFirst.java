package me.alexssandroreis.hackranksolved.warmup;

import java.util.Scanner;

/**
 * Resolution of Solve Me First Chalenge
 */
public class SolveMeFirst {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();

        System.out.println(solve(a, b));
    }

    private static int solve(int a, int b) {
        return a + b;
    }

}
