package Model;

// uses the user object as represented by an account in system
public class Account {
    private User user;

    public Account(User user) {
        this.user = user;
    }

    // returns the user within the account
    public User getUser() {
        return user;
    }
}
