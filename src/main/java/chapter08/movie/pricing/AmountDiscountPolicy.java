package chapter08.movie.pricing;

import chapter08.money.Money;
import chapter08.movie.DiscountCondition;
import chapter08.movie.DiscountPolicy;
import chapter08.movie.Screening;

public class AmountDiscountPolicy extends DiscountPolicy {
    private Money discountAmount;

    public AmountDiscountPolicy(Money discountAmount, DiscountCondition... conditions) {
        super(conditions);
        this.discountAmount = discountAmount;
    }

    @Override
    protected Money getDiscountAmount(Screening screening) {
        return discountAmount;
    }
}
