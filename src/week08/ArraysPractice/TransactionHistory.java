package week08.ArraysPractice;

public class TransactionHistory {

    public static void main(String[] args) {
        double accountBalance = 20500.0;
        double[] charges = {20.99, 61.61, 250.0, 354.15, 157.50, 0.77, 1.60};

        for (int i = 0; i < charges.length; i++) {
            accountBalance -= charges[i];

            System.out.printf("Processing transaction -%.2f\t%.2f%n",
                    charges[i],
                    accountBalance);

        }

    }
}
