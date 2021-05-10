package movie_project.step01_interface_base;

import lombok.Data;
import lombok.Getter;

import java.time.Duration;

//@Data
public class Movie {
    private String title;
    private Duration runnintTime;
    private Money fee;

    // 합성(Composition)
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
        /*
        * 할인 정책이 없는 경우를 예외 케이스로 취급하기 때문에 지금까지 일관성 있던 협력 방식이 무너짐.
        * 할인 정책이 없는 경우에는 할인 금액이 0원이라는 사실을 결정하는 책임이 DiscountPolicy가 아닌
        * Movie쪽에 있기 때문에 일관성이 깨짐.
        * 항상 예외 케이스를 최소화하고 일관성을 유지할 수 있는 방법을 선택하라.
         */
//        if(discountPolicy == null) {
//            return fee;
//        }

        return fee.minus(discountPolicy.calculateDiscountAmount(screening));
    }

    public String getTitle() {
        return this.title;
    }
}
