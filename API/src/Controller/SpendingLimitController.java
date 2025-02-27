package Controller;

import Model.SpendingLimit;
import Model.User;

// controller for setting a spending limit for user
public class SpendingLimitController {
    public void setLimit(User user, SpendingLimit limit, double amount) {
        limit.setLimitAmount(amount);
    }
}

package Controller;
