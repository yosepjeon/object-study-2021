package movie_project.step02_subclass_base.pricing;

import movie_project.step02_subclass_base.DiscountCondition;
import movie_project.step02_subclass_base.Screening;

public class SequenceCondition implements DiscountCondition {
    private int sequence;

    public SequenceCondition(int sequence) {
        this.sequence = sequence;
    }

    @Override
    public boolean isSatisfiedBy(Screening screening) {
        return screening.isSequence(sequence);
    }
}
