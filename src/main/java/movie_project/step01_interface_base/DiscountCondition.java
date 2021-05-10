package movie_project.step01_interface_base;

public interface DiscountCondition {
    boolean isSatisfiedBy(Screening screening);
}
