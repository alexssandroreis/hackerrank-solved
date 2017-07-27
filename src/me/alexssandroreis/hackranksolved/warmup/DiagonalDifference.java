package me.alexssandroreis.hackranksolved.warmup;

import java.util.Scanner;

/**
 * Resolution of Diagonal Difference
 */
public class DiagonalDifference {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[][] matrix = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int f = 0; f < n; f++) {
                matrix[i][f] = scanner.nextInt();
            }
        }

        int result = solve(matrix);

        System.out.print(result < 0 ? result * -1 : result);
    }

    private static int solve(int[][] matrix) {
        int resultTopDown = 0;
        int resultBottomUp = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int f = 0; f < matrix[i].length; f++) {

                if (f == i) {
                    resultTopDown += matrix[i][f];
                }

                if (f + 1 == matrix[i].length -i) {
                    resultBottomUp += matrix[i][f];
                }
            }
        }

        return resultTopDown - resultBottomUp;
    }
}
