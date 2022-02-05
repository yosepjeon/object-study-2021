package chapter08.movie.pricing;

import chapter08.money.Money;
import chapter08.movie.DiscountCondition;
import chapter08.movie.DiscountPolicy;
import chapter08.movie.Screening;

public class PercentDiscountPolicy extends DiscountPolicy {
    private double percent;

    public PercentDiscountPolicy(double percent, DiscountCondition... conditions) {
        super(conditions);
        this.percent = percent;
    }

    @Override
    protected Money getDiscountAmount(Screening screening) {
        return screening.getMovieFee().times(percent);
    }
}
