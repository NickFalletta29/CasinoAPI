import Controller.SpendingLimitController;
import Model.SpendingLimit;
import View.SpendingLimitView;
import View.UserView;
import Model.User;
import Controller.UserAuthController;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        SpendingLimit model = new SpendingLimit();
        SpendingLimitView view = new SpendingLimitView();
        String userId = "user123"; // Example user

        new SpendingLimitController(model, view, userId);

        JFrame frame = new JFrame("Casino Spending Limit");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.add(view);
        frame.setVisible(true);

        User testUser = new User("1", "testUser", "password123", "test@example.com", 100.0);

        UserView authView = new UserView();
        UserAuthController authController = new UserAuthController(testUser, authView);

        //testing authentication
        System.out.println("Testing Authentication:");
        System.out.println("Correct Login: " + authController.authenticate("testUser", "password123")); //supposed to return true
        System.out.println("Incorrect Login: " + authController.authenticate("testUser33", "pass444")); //supposed to return false
    }
}



