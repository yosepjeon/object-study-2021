package movie_project;

import java.time.Duration;

public class Movie {
    private String title;
    private Duration runnintTime;
    private Money fee;
    private DiscountPolicy discountPolicy;

    public Movie(String title, Duration runnintTime, Money fee, DiscountPolicy discountPolicy) {
        this.title = title;
        this.runnintTime = runnintTime;
        this.fee = fee;
        this.discountPolicy = discountPolicy;
    }

    public Money getFee() {
        return fee;
    }

    public Money calculateMovieFee(Screening screening) {
        return fee.minus(discountPolicy.calculateDiscountAmount(screening));
    }
}
