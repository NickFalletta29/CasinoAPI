package Controller;

import Model.User;
import View.LoginView;
import View.UserView;

import javax.swing.*;

public class UserAuthController {
    private User model;
    private LoginView view;

    public UserAuthController(User model, LoginView view) {
        this.model = model;
        this.view = view;
    }

   //authenticates the user based on username and password
    public boolean authenticate(String username, String password) {
        //checks if the username and password match expected values
        boolean isAuthenticated = username.equals("testUser") && password.equals("password123");

        if (isAuthenticated) {
            JOptionPane.showMessageDialog(view, "Login Successful!", "Success", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(view, "Invalid Credentials!", "Error", JOptionPane.ERROR_MESSAGE);
        }

        return isAuthenticated;
    }

   //gets username of user
    public String getUsername() {
        return model.getUsername();
    }

    //gets user's current balance
    public double getUserBalance() {
        return model.getBalance();
    }

    //updates user's balance
    public boolean updateUserBalance(double newBalance) {
        if (newBalance < 0) {
            JOptionPane.showMessageDialog(view, "Balance cannot be negative!", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        model.setBalance(newBalance);
        JOptionPane.showMessageDialog(view, "Balance updated successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
        return true;
    }

   //displays user details
    public void displayUserInfo() {
        String userInfo = "Username: " + getUsername() + "\nBalance: $" + getUserBalance();
        JOptionPane.showMessageDialog(view, userInfo, "User Info", JOptionPane.INFORMATION_MESSAGE);
    }
}
