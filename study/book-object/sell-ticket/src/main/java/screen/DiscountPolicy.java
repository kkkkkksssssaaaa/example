package screen;

/**
 * ### 2.5 추상화와 유연성
 *
 * - 기존 추상 클래스는 DefaultDiscountPolicy 로 변경
 * - 인터페이스만 분리
 * */
public interface DiscountPolicy {

    Money calculateDiscountAmount(Screening screening);

}
