package week08.ArraysPractice;

public class DailyWalkingSteps {

    public static void main(String[] args) {

        int[] dailySteps = {1000, 2000, 3000, 4000, 5000, 6000, 7000};
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        // Print lengths
        System.out.println("Number of step records: " + dailySteps.length );
        System.out.println("Number of days: " + days.length);

        // Print steps without a loop
        System.out.println("\nSteps without a loop: ");
        System.out.println(dailySteps[0]);
        System.out.println(dailySteps[1]);
        System.out.println(dailySteps[2]);
        System.out.println(dailySteps[3]);
        System.out.println(dailySteps[4]);
        System.out.println(dailySteps[5]);
        System.out.println(dailySteps[6]);

        // Print steps with a loop
        System.out.println("\nSteps with a loop: ");
        for (int i = 0; i < dailySteps.length; i++) {
            System.out.println(dailySteps[i]);
        }

        // Print day name without a loop
        System.out.println("\nDay name without a loop: ");
        System.out.println(days[0]);
        System.out.println(days[1]);
        System.out.println(days[2]);
        System.out.println(days[3]);
        System.out.println(days[4]);
        System.out.println(days[5]);
        System.out.println(days[6]);

        //Print day name with loop
        System.out.println("\nDay name with loop: ");
        for (int i = 0; i < days.length; i++) {
            System.out.println(days[i]);
        }

        // Print each day with its steps and calculate the weekly total
        int totalSteps = 0;
        System.out.println("\nDaily walking steps: ");
        for (int i = 0; i < days.length; i++) {
            System.out.println(days[i] + ": " + dailySteps[i] + " steps" );
            totalSteps += dailySteps[i];
        }

        System.out.println("\nWeekly total steps: " + totalSteps);

    }
}
