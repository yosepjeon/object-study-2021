package movie_project.step02_subclass_base;

public interface DiscountPolicy {
    Money calculateDiscountAmount(Screening screening);
}
