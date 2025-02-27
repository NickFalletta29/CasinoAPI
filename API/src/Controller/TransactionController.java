package Controller;

import Model.Transaction;
import Model.User;

// processes transaction
public class TransactionController {
    public boolean processTransaction(User user, Transaction transaction) {
        if (user.getBalance() >= transaction.getAmount()) {
            user.setBalance(user.getBalance() - transaction.getAmount());
            return true; // success
        }
        return false; // unsuccess
    }
}
