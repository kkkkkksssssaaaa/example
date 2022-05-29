package screen;

/**
 * ### 2.3 할인 요금 구하기
 *
 * - `영화의 할인 조건` 을 구현하는 클래스
 * */
public interface DiscountCondition {

    // TODO 영화 정보를 통해 할인 조건에 부합하는지 여부 판단하여 반환
    boolean isSatisfiedBy(Screening screening);

}
