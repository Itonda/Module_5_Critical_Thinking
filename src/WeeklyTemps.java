// Needed utility for constructing ArrayLists
import java.util.ArrayList;

// Class with an ArrayList for days and an Arraylist for Temps as attributes
public class WeeklyTemps {
    private ArrayList<String> days = new ArrayList<>();
    private ArrayList<Double> avgTemps = new ArrayList<>();

    /* Adding days of the week to ArrayList 'days' and temperatures to ArrayList 'temps.'
    Indexes align days to temps */
    public WeeklyTemps() {
        days.add("Monday");
        days.add("Tuesday");
        days.add("Wednesday");
        days.add("Thursday");
        days.add("Friday");
        days.add("Saturday");
        days.add("Sunday");

        avgTemps.add(23.7);
        avgTemps.add(21.3);
        avgTemps.add(21.9);
        avgTemps.add(22.1);
        avgTemps.add(22.6);
        avgTemps.add(22.2);
        avgTemps.add(21.4);
    }
    // Method for calculating average temperatures for the week
    public double weeklyAverage() {
        double totalTemps = 0;
        for (double temp : avgTemps) {
            totalTemps += temp;
        }
        return totalTemps / avgTemps.size();

    }
    // Added method to print all average temps per day
    public void getAllAvgTemps() {
        System.out.println();
        for (int i = 0; i < days.size(); i++) {
            System.out.printf("%s: %.2f°C\n", days.get(i), avgTemps.get(i));
        }
    }
    // Method for getting the average temperature for a day
    public double getAvgDayTemp(String day) {
        int daysIndex = days.indexOf(day);
        return avgTemps.get(daysIndex);
    }
}