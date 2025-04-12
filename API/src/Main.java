// import View.SpendingLimitView;
// import View.UserView;
// import Model.User;
// import Controller.UserAuthController;
// import Controller.TransactionController;
// import Model.Transaction;

// import javax.swing.*;

// public class Main {
//     public static void main(String[] args) {
//         // Setting up Spending Limit UI
//         SpendingLimit model = new SpendingLimit();
//         SpendingLimitView view = new SpendingLimitView();
//         String userId = "user123";

//         new SpendingLimitController(model, view, userId);

//         JFrame frame = new JFrame("Casino Spending Limit");
//         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//         frame.setSize(400, 300);
//         frame.add(view);
//         frame.setVisible(true);

//         // User Authentication Test
//         User testUser = new User("1", "testUser", "password123", "test@example.com", 100.0);
//         UserView authView = new UserView();
//         UserAuthController authController = new UserAuthController(testUser, authView);

//         System.out.println("Testing Authentication:");
//         System.out.println("Correct Login: " + authController.authenticate("testUser", "password123")); // expected to be true
//         System.out.println("Incorrect Login: " + authController.authenticate("testUser33", "pass444")); // expected to be false

//         // Transaction Testing
//         TransactionController transactionController = new TransactionController();


//         System.out.println("\nTesting Transactions: ");
//         System.out.println("\nUser's current balance: " + testUser.getBalance());
//         //deposit was suscessful, balance increases by 50
//         Transaction deposit = new Transaction("001", 50.0, "deposit");
//         boolean depositSuccess = transactionController.processTransaction(testUser, deposit);
//         System.out.println("Deposit Transaction Success: " + depositSuccess + " | New Balance: " + testUser.getBalance());

//         //bet placed successfully, balance refelects that
//         Transaction bet = new Transaction("002", 30.0, "bet");
//         boolean betSuccess = transactionController.processTransaction(testUser, bet);
//         System.out.println("Bet Transaction Success: " + betSuccess + " | New Balance: " + testUser.getBalance());

//         //bet transaction failed balance stays the same
//         Transaction failedBet = new Transaction("003", 200.0, "bet");
//         boolean failedBetSuccess = transactionController.processTransaction(testUser, failedBet);
//         System.out.println("Bet Transaction Success: " + failedBetSuccess + " | New Balance: " + testUser.getBalance());

//         //withdrawl unsucessful balance stays the same
//         Transaction invalidTransaction = new Transaction("004", -10.0, "withdrawl");
//         boolean invalidSuccess = transactionController.processTransaction(testUser, invalidTransaction);
//         System.out.println("Withdrawl Transaction Success: " + invalidSuccess + " | New Balance: " + testUser.getBalance());
//     }
// }




