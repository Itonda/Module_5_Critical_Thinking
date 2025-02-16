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
        String input = scnr.nextLine();

        if (input.equals("Week")) {
            System.out.printf("\nWeekly average temperature: %.2f°C\n", weeklyTemps.weeklyAverage());
        } else {
            double dayTemp = weeklyTemps.getDayTemp(input);
            System.out.printf("\n%s's average temperature is: %.2f°C\n", input, dayTemp);
        }
        //Release scanner
        scnr.close();
    }
}
