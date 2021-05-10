package movie_project.pricing;

import movie_project.step01_interface_base.DiscountPolicy;
import movie_project.step01_interface_base.Money;
import movie_project.step01_interface_base.Screening;

public class NoneDiscountPolicy extends DiscountPolicy {
    @Override
    protected Money getDiscountAmount(Screening screening) {
        return Money.ZERO;
    }
}
