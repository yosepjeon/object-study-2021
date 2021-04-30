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

    // Audience는 자율적인 존재임.
    // Bag은 과거의 Audience처럼 스스로 자기 자신을 책임지지 않고 Audience에 의해
    // 끌려다니는 수동적인 존재다. 이걸 자율적인 존재로 바꿔보자.
    public Long buy(Ticket ticket) {
//        이 코드를 Bag으로 옮길 것 이다.
//        if(bag.hasInvitation()) {
//            bag.setTicket(ticket);
//            return 0L;
//        }else {
//            bag.setTicket(ticket);
//            bag.minusAmount(ticket.getFee());
//            return ticket.getFee();
//        }

        return bag.hold(ticket);
    }
}
