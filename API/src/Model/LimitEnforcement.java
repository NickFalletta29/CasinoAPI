package Model;

// check if transaction exceeds the user spending limit
public class LimitEnforcement {
    public static boolean exceedsLimit(double amount, SpendingLimit limit) {
        return amount > limit.getLimitAmount();
    }
}
