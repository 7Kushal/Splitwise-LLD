package model.Split;

import model.User;

public class PercentSplit extends Split {
    double percent;
//    double amount;
public PercentSplit(User user, double percent) {
        super(user);
        this.percent=percent;
    }

    public double getPercent(){
        return this.percent;
    }
}
