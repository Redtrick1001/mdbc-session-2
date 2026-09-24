package com.mdigital;

import java.util.HashMap;

public class WeeklyRoutineTask {
    static void main() {
        for (int i = 0; i <= 7; i++) {
            System.out.println(WeeklyRoutineTask.weeklyRoutine(i));
        }
    }

    public static String weeklyRoutine(int dayOfWeek) {
        HashMap<Integer, String> days = new HashMap<>();
        days.put(1, "Monday");
        days.put(2, "Tuesday");
        days.put(3, "Wednesday");
        days.put(4, "Thursday");
        days.put(5, "Friday");
        days.put(6, "Saturday");
        days.put(7, "Sunday");

        String output = "";
        if ((dayOfWeek <= 0) || (dayOfWeek > 7)) {
            output += "you have entered in an invalid day\n";
            return output;
        }

        if (dayOfWeek < 6) {
            output += days.get(dayOfWeek) + " is week day\n";
            if ((dayOfWeek == 2) || (dayOfWeek == 4)) {
                output += "On a " + days.get(dayOfWeek) + " I go to the gym\n";
            }

        } else if (dayOfWeek == 7) {
            output += "On a " + days.get(dayOfWeek) + " I do gardening\n";
        }

        return output;
    }
}
