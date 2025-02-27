package Controller;

import Model.User;

// handles user auth
public class UserAuthController {
    public boolean authenticate(String username, String password) {
        // check if username and password are equal to placeholder vals
        return username.equals("testUser") && password.equals("password123");
    }
}
