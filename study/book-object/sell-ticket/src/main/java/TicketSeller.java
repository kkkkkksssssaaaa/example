/**
 * ### 1.1 티켓 판매 어플리케이션 구현하기
 *
 * - 티켓 판매원을 구현한 클래스
 * */
public class TicketSeller {

    private TicketOffice ticketOffice;

    public TicketSeller(TicketOffice ticketOffice) {
        this.ticketOffice = ticketOffice;
    }

    public TicketOffice getTicketOffice() {
        return ticketOffice;
    }

}
