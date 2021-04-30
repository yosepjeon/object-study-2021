package chapter01;

/*
* 수정된 Theater 클래스 어디서도 ticketOffice에 접근하지 않는다.
* Theater는 오직 TicketSeller의 Interface에만 의존한다.
* TicketSeller 내부에 TicketOffice Instance를 포함하고 있다는 사실은
* Implementation 영역에 속한다.
 */
public class Theater {
    private TicketSeller ticketSeller;

    public Theater(TicketSeller ticketSeller) {
        this.ticketSeller = ticketSeller;
    }

    // 기존 enter의 복잡한 코드는 ticketSeller에 옮기고,
    // Theater는 ticketSeller를 간단하게 호출하기만 하면 된다.
    public void enter(Audience audience) {
        ticketSeller.sellTo(audience);
    }
}
