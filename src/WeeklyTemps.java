// Needed utility for constructing ArrayLists
import java.util.ArrayList;

// Class with an ArrayList for days and an Arraylist for Temps as attributes
public class WeeklyTemps {
    private ArrayList<String> days = new ArrayList<>();
    private ArrayList<Double> temps = new ArrayList<>();

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

        temps.add(23.7);
        temps.add(21.3);
        temps.add(21.9);
        temps.add(22.1);
        temps.add(22.6);
        temps.add(22.2);
        temps.add(21.4);
    }
    // Method for calculating average temperatures for the week
    public double weeklyAverage() {
        double totalTemps = 0;
        for (double temp : temps) {
            totalTemps += temp;
        }

        return totalTemps / temps.size();
    }
    // Method for getting the average temperature for a day
    public double getDayTemp(String day) {
        int daysIndex = days.indexOf(day);
        return temps.get(daysIndex);
    }
}
