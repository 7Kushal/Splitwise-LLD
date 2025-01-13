package model.Expense;

//import PercentSplit;
import model.Split.Split;
import model.User;
import model.Split.*;
import java.util.List;

public class PercentExpense extends Expense{
    public PercentExpense(double amount, User paidBy, List<Split> splitList) {
        super(amount, paidBy, splitList);
    }

    @Override
    public boolean validate(){
        for(Split split: splitList){
            if(!(split instanceof PercentSplit))
                return false;
        }
        double total=0D;
        for(Split split: splitList){
            PercentSplit split1 = (PercentSplit) split;
            total += amount*((double)split1.getPercent())/100;
        }
        return total!=amount;
//        return true;
    }
}
