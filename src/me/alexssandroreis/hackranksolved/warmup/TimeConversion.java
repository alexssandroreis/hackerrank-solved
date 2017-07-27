package me.alexssandroreis.hackranksolved.warmup;

import java.util.Scanner;

/**
 * Solution of Time Conversion challenge
 */
public class TimeConversion {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String time = in.next();

        System.out.println(solve(time));
    }

    static String solve(String time) {
        String result = time.replaceAll("AM", "").replace("PM", "");

        String[] times = result.split(":");

        int hour = Integer.valueOf(times[0]);

        if (time.contains("PM") && hour != 12) {
            String correspondentHour = "";

            switch (hour) {
                case 1: correspondentHour = "13"; break;
                case 2: correspondentHour = "14"; break;
                case 3: correspondentHour = "15"; break;
                case 4: correspondentHour = "16"; break;
                case 5: correspondentHour = "17"; break;
                case 6: correspondentHour = "18"; break;
                case 7: correspondentHour = "19"; break;
                case 8: correspondentHour = "20"; break;
                case 9: correspondentHour = "21"; break;
                case 10: correspondentHour = "22"; break;
                case 11: correspondentHour = "23"; break;
            }

            result = correspondentHour + ":" + times[1] + ":"  + times[2];
        } else if (time.contains("AM") && hour == 12){
            result = "00:" + times[1] + ":"  + times[2];
        }

        return result;
    }
}
