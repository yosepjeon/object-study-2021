package chapter01;

/*
* 관람객은 소지품을 보관하기 위해 가방을 소지할 수 있다.
 */
public class Audience {
    private Bag bag;

    public Audience(Bag bag) {
        this.bag = bag;
    }

    public Bag getBag() {
        return bag;
    }

    public Long buy(Ticket ticket) {
        if(bag.hasInvitation()) {
            bag.setTicket(ticket);
            return 0L;
        }else {
            bag.setTicket(ticket);
            bag.minusAmount(ticket.getFee());
            return ticket.getFee();
        }
    }
}
