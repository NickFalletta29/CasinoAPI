package Controller;

import Model.SpendingLimit;
import Model.Transaction;
import Model.User;

public class TransactionController {
    private SpendingLimit spendingLimit;

    public TransactionController(SpendingLimit spendingLimit) {
        this.spendingLimit = spendingLimit;
    }

     // analyzes transaction type and amount
    public boolean processTransaction(User user, Transaction transaction) {
        if (transaction == null || user == null) {
            return false; //false if input is invalid
        }

        double transactionAmount = transaction.getAmount();

        if (transactionAmount <= 0) {
            return false; //false if transaction amount is negative
        }

        if (transaction.getType().equalsIgnoreCase("deposit")) {
            return deposit(user, transactionAmount);
        } else if (transaction.getType().equalsIgnoreCase("bet")) {
            return placeBet(user, transactionAmount);
        } else {
            return false;
        }
    }

    //adds deposit to balanace
    public boolean deposit(User user, double amount) {
        user.setBalance(user.getBalance() + amount);
        logTransaction(user, "Deposit", amount);
        return true;
    }

 //as long as user balance is greater than amount that is trying to be bet, the bet will go through
    public boolean placeBet(User user, double amount) {
        if (user.getBalance() >= amount) {
            user.setBalance(user.getBalance() - amount);
            logTransaction(user, "Bet", amount);
            return true;
        }
        return false; // not enough funds
    }

    //logs the transaction
    private void logTransaction(User user, String type, double amount) {
        System.out.println("Transaction Logged: User: " + user.getUsername() + ", Type: " + type + ", Amount: $" + amount);
    }

}
    public interface TransactionCommand {
    boolean execute();
}

public class DepositCommand implements TransactionCommand {
    private User user;
    private double amount;
    public DepositCommand(User user, double amount) {
        this.user = user;
        this.amount = amount;
    }
    @Override
    public boolean execute() {
        return deposit(user, amount);
    }
}

public class BetCommand implements TransactionCommand {
    private User user;
    private double amount;
    public BetCommand(User user, double amount) {
        this.user = user;
        this.amount = amount;
    }
    @Override
    public boolean execute() {
        return placeBet(user, amount);
    }
}
