package chapter06.theater.step01;

public class Theater {
    private TicketSeller ticketSeller;

    public Theater(TicketSeller ticketSeller) {
        this.ticketSeller = ticketSeller;
    }

    public void enter(Audience audience) {
        if (audience.getBag().hasInvitation()) {
            Ticket ticket = ticketSeller.getTicketOffice().getTicket();
            audience.getBag().setTicket(ticket); // -> 디미터 법칙 위반
        } else {
            Ticket ticket = ticketSeller.getTicketOffice().getTicket();
            audience.getBag().minusAmount(ticket.getFee()); // -> 디미터 법칙 위반
            ticketSeller.getTicketOffice().plusAmount(ticket.getFee()); // -> 디미터 법칙 위반
            audience.getBag().setTicket(ticket);
        }
    }
}
