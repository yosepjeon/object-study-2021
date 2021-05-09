package movie_project;

public interface DiscountCondition {
    boolean isSatisfiedBy(Screening screening);
}
