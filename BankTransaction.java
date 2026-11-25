class BankTransaction {
    int balance = 10000;

    void withdraw(String amount) {
        int money = Integer.parseInt(amount);

        if (money <= 0) {
            throw new IllegalArgumentException("Amount must be positive!");
        }

        if (money > balance) {
            throw new IllegalArgumentException("Insufficient balance!");
        }

        balance = balance - money;
        System.out.println("Withdrawal successful!");
        System.out.println("Remaining balance: " + balance);
    }

    public static void main(String[] args) {
        BankTransaction b = new BankTransaction();

        try {
            b.withdraw("2000");
        }
        catch (NumberFormatException e) {
            System.out.println("Invalid amount format!");
        }
        catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}