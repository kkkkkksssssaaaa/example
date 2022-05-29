package screen;

/**
 * ### 2.5 추상화와 유연성
 *
 * - 할인 정책이 없는 경우
 * */
public class NoneDiscountPolicy extends DiscountPolicy {

    @Override
    protected Money getDiscountAmount(Screening screening) {
        return Money.ZERO;
    }

}
