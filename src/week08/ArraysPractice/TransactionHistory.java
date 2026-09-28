package week08.ArraysPractice;

public class TransactionHistory {

    public static void main(String[] args) {
        double accountBalance = 20500.0; // Initial balance
        double[] charges = {20.99, 61.61, 250.0, 354.15, 157.50, 0.77, 1.60}; // Transaction charges

        for (int i = 0; i < charges.length; i++) { // Loop through each charge
            accountBalance -= charges[i]; // Deduct the charge from the account balance

            System.out.printf("Processing transaction -%.2f\t%.2f%n",
                    charges[i],
                    accountBalance); // Print the charge and the new account balance
            // printf() is a method in the String class that formats a string and prints it to the console.

        }

    }
}
