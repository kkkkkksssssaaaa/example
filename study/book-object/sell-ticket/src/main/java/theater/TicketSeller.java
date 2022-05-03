package theater;

/**
 * ### 1.3 설계 개선하기
 *
 * - 티켓 판매원을 구현한 클래스
 * */
public class TicketSeller {

    private TicketOffice ticketOffice;

    public TicketSeller(TicketOffice ticketOffice) {
        this.ticketOffice = ticketOffice;
    }

    public void sellTo(Audience audience) {
        ticketOffice.sellTicketTo(audience);
    }

}
