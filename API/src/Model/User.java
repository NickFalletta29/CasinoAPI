package Model;

public class User {
    private String userId;
    private String username;
    private String password;
    private String email;
    private double balance;
    private String firstName;
    private String lastName;

    public User(String userId, String username, String password, String email, double balance, String firstName, String lastName) {
        this.userId = userId;
        this.username = username;
        this.password = password;
        this.email = email;
        this.balance = balance;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // Gets user ID
    public String getUserId() {
        return userId;
    }

    // Gets username
    public String getUsername() {
        return username;
    }

    // Gets email
    public String getEmail() {
        return email;
    }

    // Gets balance
    public double getBalance() {
        return balance;
    }

    // Updates balance
    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Gets first name
    public String getFirstName() {
        return firstName;
    }

    // Sets first name
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    // Gets last name
    public String getLastName() {
        return lastName;
    }

    // Sets last name
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // Authenticates user login credentials
    public boolean authenticate(String username, String password) {
        return this.username.equals(username) && this.password.equals(password);
    }

    // Updates password
    public boolean updatePassword(String oldPassword, String newPassword) {
        if (this.password.equals(oldPassword) && newPassword != null && !newPassword.isEmpty()) {
            this.password = newPassword;
            return true;
        }
        return false;
    }

    // Resets user password
    public boolean resetPassword() {
        return true;
    }
}

