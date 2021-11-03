package Chapter2;

public class Java2_05 {
    int orderNumber;
    String orderId;
    String orderDay;
    String orderName;
    String itemNumber;
    String orderAddress;

    public static void main(String[] args) {
        Java2_05 order = new Java2_05();
        order.orderNumber = 20211103;
        order.orderId = "abc123";
        order.orderDay = "2021년 11월 1일";
        order.orderName = "홍길동";
        order.itemNumber = "PD345-12";
        order.orderAddress = "광주광역시 @구 @@동 @@@번지";

        System.out.println("주문 번호 : " +order.orderNumber );
        System.out.println("주문자 아이디 : " +order.orderId );
        System.out.println("주문 날짜 : " +order.orderDay );
        System.out.println("주문자 이름 : " +order.orderName );
        System.out.println("주문 상품 번호 : " +order.itemNumber );
        System.out.println("배송 장소 : " + order.orderDay);

    }
}
