package model.Split;

import model.User;

public abstract class Split {
    User user;
    public double amount;

    public void setUser(User user) {
        this.user = user;
    }

    public double getAmount() {
        return amount;
    }

    Split(User user){
       this.user=user;
    }

    public void setAmount(double splitAmount) {
        this.amount = splitAmount;
    }

    public User getUser() {
        return  user;
    }
}
