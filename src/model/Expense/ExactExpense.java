package model.Expense;

//import ExactSplit;
import model.Split.Split;
import model.User;

import java.util.List;
import model.Split.*;
public class ExactExpense extends Expense {

    public ExactExpense(double amount, User paidBy, List<Split> splitList) {
        super(amount, paidBy, splitList);
    }

    @Override
    public boolean validate() {

        for(Split split : splitList) {
            if (!(split instanceof ExactSplit))
                return false;
        }

        double total = 0;
        for(Split split : splitList)
            total+=split.amount;

        return total == amount;
    }
}
