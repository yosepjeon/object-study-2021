package movie_project.pricing;

import movie_project.DiscountPolicy;
import movie_project.Money;
import movie_project.Screening;

public class NoneDiscountPolicy extends DiscountPolicy {
    @Override
    protected Money getDiscountAmount(Screening screening) {
        return Money.ZERO;
    }
}
