package Model;

// contains rules to determine if bet is allowed
public class BettingRules {
    public static boolean isBetAllowed(double amount, double balance) {
        return amount <= balance;
    }
}
