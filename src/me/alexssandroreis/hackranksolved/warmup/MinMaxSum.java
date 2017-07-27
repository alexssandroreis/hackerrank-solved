package me.alexssandroreis.hackranksolved.warmup;

import java.util.Scanner;

/**
 * Solution of Min Max Sum Challenge
 */
public class MinMaxSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[5];
        for(int i = 0; i < 5; i++){
            array[i] = scanner.nextInt();
        }

        int[] result = solution(array);

        System.out.println(result[0] + " " + result[1]);
    }

    private static int[] solution(int[] array) {
        int[] result = new int[2];
        for (int i = 0; i < array.length; i++) {
            int sum = 0;
            for (int f = 0; f < array.length; f++) {
                if (f == i) {
                    continue;
                }

                sum += array[f];
            }

            if (sum < result[0] || result[0] == 0){
                result[0] = sum;
            }

            if (sum > result[1]) {
                result[1] = sum;
            }
        }

        return  result;
    }
}
