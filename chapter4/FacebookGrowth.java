public class FacebookGrowth {
    public static void main(String[] args) {
        double currentUsers = 1_000_000_000; // 1 billion
        double growthRate = 0.04;            // 4% per month

        double target1 = 1_500_000_000;      // 1.5 billion
        double target2 = 2_000_000_000;      // 2 billion

        double monthsToTarget1 = Math.log(target1 / currentUsers) / Math.log(1 + growthRate);
        double monthsToTarget2 = Math.log(target2 / currentUsers) / Math.log(1 + growthRate);

        System.out.printf("Months to reach 1.5 billion users: %.2f%n", monthsToTarget1);
        System.out.printf("Months to reach 2 billion users: %.2f%n", monthsToTarget2);
    }
}
