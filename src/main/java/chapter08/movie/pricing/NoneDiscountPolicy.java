package chapter08.movie.pricing;

import chapter08.money.Money;
import chapter08.movie.DiscountPolicy;
import chapter08.movie.Screening;

public class NoneDiscountPolicy extends DiscountPolicy {
    @Override
    protected Money getDiscountAmount(Screening screening) {
        return Money.ZERO;
    }
}
