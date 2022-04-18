/**
 * ### 1.3 설계 개선하기
 *
 * - 소극장을 구현하는 클래스
 * */
public class Theater {

    private TicketSeller ticketSeller;

    public Theater(TicketSeller ticketSeller) {
        this.ticketSeller = ticketSeller;
    }

    /**
     * 관람객을 맞이함
     *
     * case1. 관람객의 가방에 초대권이 있는 경우 관람객의 amount 는 차감되지 않고 티켓 판매원에게 티켓을 받을 수 있음
     * case2. 관람객의 초대권을 갖고 있지 않은 경우 관람객은 티켓 판매원을 통해 티켓을 구매할 수 있음
     * */
    public void enter(Audience audience) {
        ticketSeller.sellTo(audience);
    }

}
