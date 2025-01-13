package model.Expense;

import model.Split.*;
import model.Split.Split;
import model.User;

import java.util.List;

public class EqualExpense extends Expense{

    public EqualExpense(double amount, User paidBy, List<Split> splitList) {
        super(amount, paidBy, splitList);
    }

    @Override
    public boolean validate(){
        for(Split split: splitList){
            if(!(split instanceof EqualSplit))
                return false;
        }
        return true;
    }
}
