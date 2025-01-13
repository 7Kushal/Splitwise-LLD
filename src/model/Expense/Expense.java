package model.Expense;

import model.Split.Split;
import model.User;

import java.util.List;

public abstract class Expense {
    String id;
    User paidBy;
    double amount;

    List<Split> splitList;

    public Expense(double amount, User paidBy, List<Split> splitList){
        this.amount=amount;
        this.paidBy=paidBy;
        this.splitList=splitList;
    }

    public abstract boolean validate();
}
