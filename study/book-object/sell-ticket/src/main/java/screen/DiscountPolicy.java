package screen;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * ### 2.3 할인 요금 구하기
 *
 * - `영화의 할인 정책` 을 구현하는 클래스
 * */
public abstract class DiscountPolicy {

    private List<DiscountCondition> conditions = new ArrayList<>();

    public DiscountPolicy(DiscountCondition... conditions) {
        this.conditions = Arrays.asList(conditions);
    }

    public Money calculateDiscountAmount(Screening screening) {
        for (DiscountCondition each : conditions) {
            if (each.isSatisfiedBy(screening)) {
                return getDiscountAmount(screening);
            }
        }

        return Money.ZERO;
    }

    abstract protected Money getDiscountAmount(Screening screening);

}
