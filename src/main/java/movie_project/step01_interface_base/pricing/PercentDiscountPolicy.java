package movie_project.pricing;

import movie_project.step01_interface_base.DiscountCondition;
import movie_project.step01_interface_base.DiscountPolicy;
import movie_project.step01_interface_base.Money;
import movie_project.step01_interface_base.Screening;

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
