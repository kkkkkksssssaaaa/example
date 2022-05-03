package theater;

/**
 * ### 1.3 설계 개선하기
 *
 * - 관람객의 소지품
 *     - 이벤트 당첨자는 티켓으로 교환할 초대장을 가지고 있다
 *     - 이벤트에 당첨되지 않은 관람객은 현금을 보유하고 있다
 *     - 따라서 관람객이 가지고 올 수 있는 소지품은 초대장, 현금, 티켓 세 가지
 * - 이벤트에 당첨된 관람객의 가방 안에는 현금과 초대장이 들어있지만 이벤트에 당첨되지 않은 관람객의 가방 안에는 초대장이 들어있지 않을 것
 * - 따라서 theater.Bag 인스턴스의 상태는 현금과 초대장을 함께 보관하거나 초대장 없이 현금만 보관하는 두 가지 중 하나 일 것!
 * */
public class Bag {

    private Long amount;
    private Invitation invitation;
    private Ticket ticket;

    public Bag(long amount) {
        this(null, amount);
    }

    public Bag(Invitation invitation, long amount) {
        this.invitation = invitation;
        this.amount = amount;
    }

    public Long hold(Ticket ticket) {
        if (hasInvitation()) {
            setTicket(ticket);

            return 0L;
        } else {
            setTicket(ticket);
            minusAmount(ticket.getFee());

            return ticket.getFee();
        }
    }

    private boolean hasInvitation() {
        return this.invitation != null;
    }

    private void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    private void minusAmount(Long amout) {
        this.amount -= amout;
    }

}
