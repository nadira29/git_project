package week08.ArraysPractice;

public class SplitPractice {
    public static void main(String[] args) {
        String reports = "CF32;CF11;CF33;CF99"; // Example report IDs
        String[] reportIds = reports.split(";"); // Split the string by semicolon
        // spilt("; ") cuts the string whenever it finds a semicolon

        for (int i = 0; i < reportIds.length; i++) { // Loop through each report ID
            System.out.println((i + 1) + ". Downloading " + reportIds[i] + "..."); // Print the report ID
        }
    }
}
