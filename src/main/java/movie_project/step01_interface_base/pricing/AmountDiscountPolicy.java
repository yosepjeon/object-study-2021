package movie_project.pricing;

import movie_project.step01_interface_base.DiscountCondition;
import movie_project.step01_interface_base.DiscountPolicy;
import movie_project.step01_interface_base.Money;
import movie_project.step01_interface_base.Screening;

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
