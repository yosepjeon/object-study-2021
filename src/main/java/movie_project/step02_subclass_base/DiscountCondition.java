package movie_project.step02_subclass_base;

public interface DiscountCondition {
    boolean isSatisfiedBy(Screening screening);
}
