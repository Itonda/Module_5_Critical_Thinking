// Needed utility for input
import java.util.Scanner;

// Main class prompts input and selects output in formatted strings for hundredth place rounding
public class InputAndDisplay {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        // Initialize instance of WeeklyTemps class (two ArrayLists for days and temps)
        WeeklyTemps weeklyTemps = new WeeklyTemps();

        System.out.print("Enter day of the week to display average temperature for that day or type 'Week' to \n" +
                "display average temperature for the week: ");
        String dayInput = scnr.nextLine();
        //Added weeklyTemps.getAllAvgTemps() to print average temps for each weekday
        if (dayInput.equals("Week")) {
            weeklyTemps.getAllAvgTemps();
            System.out.printf("\nWeekly average temperature: %.2f°C\n", weeklyTemps.weeklyAverage());

        } else {
            double avgDayTemp = weeklyTemps.getAvgDayTemp(dayInput);
            System.out.printf("\n%s's average temperature is: %.2f°C\n", dayInput, avgDayTemp);
        }
        //Release scanner
        scnr.close();
    }
}