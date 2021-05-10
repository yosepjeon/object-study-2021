package movie_project.step02_subclass_base.pricing;

import movie_project.step02_subclass_base.DefaultDiscountPolicy;
import movie_project.step02_subclass_base.Money;
import movie_project.step02_subclass_base.Screening;

public class NoneDiscountPolicy extends DefaultDiscountPolicy {
    @Override
    protected Money getDiscountAmount(Screening screening) {
        return Money.ZERO;
    }
}
