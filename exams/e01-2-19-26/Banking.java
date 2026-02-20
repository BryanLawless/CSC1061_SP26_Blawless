public class Banking {

    public static void main(String[] args) {
        /*
         * ==========================================================
         * PART ONE
         * ==========================================================
         */

        /* Checking Account */
        CheckingAccount checkingAccount = new CheckingAccount(
            1111,
            2000,
            200,
            0.5
        );
        checkingAccount.withdraw(2100);
        checkingAccount.deposit(3000);

        System.out.println(checkingAccount.toString());

        /* Savings Account */
        SavingsAccount savingsAccount = new SavingsAccount(1100, 500, 200, 1.0);
        savingsAccount.withdraw(300);
        System.out.println(savingsAccount.toString());

        /*
         * ==========================================================
         * PART TWO
         * ==========================================================
         */
        CheckingAccount checkingAccount2 = new CheckingAccount(
            2222,
            "George",
            1000,
            200,
            1.5
        );

        checkingAccount2.deposit(30);
        checkingAccount2.deposit(40);
        checkingAccount2.deposit(50);

        checkingAccount2.withdraw(5);
        checkingAccount2.withdraw(4);
        checkingAccount2.withdraw(2);

        System.out.println(
            "\n\n=== Account Summary ===\n" +
                "Account ID: " +
                checkingAccount2.getId() +
                "\n" +
                "Account Name: " +
                checkingAccount2.getName() +
                "\n" +
                "Account Balance: $" +
                checkingAccount2.getBalance() +
                "\n" +
                "Annual Interest Rate: " +
                checkingAccount2.getAnnualIntrestRate() +
                "\n" +
                "Transactions: " +
                checkingAccount2.getTransactions()
        );
    }
}
