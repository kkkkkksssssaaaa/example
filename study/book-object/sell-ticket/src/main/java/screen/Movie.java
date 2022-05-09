package screen;

import java.time.Duration;

/**
 * ### 2.3 할인 요금 구하기
 *
 * - `영화` 를 구현하는 클래스
 * */
public class Movie {

    private String title;
    private Duration runningTime;
    private Money fee;
    private DiscountPolicy discountPolicy;

    public Movie(String title,
                 Duration runningTime,
                 Money fee,
                 DiscountPolicy discountPolicy) {
        this.title = title;
        this.runningTime = runningTime;
        this.fee = fee;
        this.discountPolicy = discountPolicy;
    }

    public Money getFee() {
        return this.fee;
    }

    /**
     * ### 2-2 객체지향 프로그래밍을 향해
     *
     * - 영화의 예매 금액 계산
     * */
    public Money calculateMovieFee(Screening screening) {
        return this.fee
                .minus(discountPolicy.calculateDiscountAmount(screening));
    }

}
