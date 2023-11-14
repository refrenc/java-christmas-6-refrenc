package christmas.view;

import christmas.domain.Badge;
import christmas.domain.event.Event;
import christmas.domain.menu.MenuItem;
import java.text.DecimalFormat;
import java.util.List;
import java.util.Map;

public class OutputView {

    static public void printHello() {
        System.out.println("안녕하세요! 우테코 식당 12월 이벤트 플래너입니다.");
    }

    static public void printDateInputMessage() {
        System.out.println("12월 중 식당 예상 방문 날짜는 언제인가요? (숫자만 입력해 주세요!)");
    }

    static public void printOrderInputMessage() {
        System.out.println("주문하실 메뉴를 메뉴와 개수를 알려 주세요. (e.g. 해산물파스타-2,레드와인-1,초코케이크-1)");
    }

    static public void printDescription() {
        System.out.println("12월 3일에 우테코 식당에서 받을 이벤트 혜택 미리 보기!");
        System.out.println();
    }

    static public void printMenu(Map<MenuItem, Integer> orders) {
        System.out.println("<주문 메뉴>");
        orders.forEach((order, amount) -> System.out.printf("%s %d개\n", order.name(), amount));
        System.out.println();
    }

    static public void printTotalPrice(Integer totalPrice) {
        System.out.println("<할인 전 총주문 금액>");
        System.out.println(formatNumber(totalPrice) + "원");
        System.out.println();
    }

    static public void printGift(Map<MenuItem, Integer> gifts) {
        System.out.println("<증정 메뉴>");
        if (gifts.isEmpty()) {
            System.out.println("없음");
            System.out.println();
            return;
        }
        gifts.forEach((order, amount) -> System.out.printf("%s %d개\n", order.name(), amount));
        System.out.println();
    }

    static public void printDiscountList(List<Event> events) {
        System.out.println("<혜택 내역>");
        if (events.isEmpty()) {
            System.out.println("없음");
            System.out.println();
            return;
        }
        for (Event event : events) {
            System.out.printf("%s: %s원\n", event.getEventName(),
                    formatNumber(event.getDiscountPrice() * -1));
        }
        System.out.println();
    }

    static public void printDiscountPrice(Integer discountPrice) {
        System.out.println("<총혜택 금액>");
        System.out.println(formatNumber(discountPrice * -1) + "원");
        System.out.println();
    }

    static public void printDiscountedPrice(Integer discountedPrice) {
        System.out.println("<할인 후 예상 결제 금액>");
        System.out.println(formatNumber(discountedPrice) + "원");
        System.out.println();
    }

    static public void printBadge(Badge badge) {
        System.out.println("<12월 이벤트 배지>");
        System.out.println(badge.getTitle());
    }

    static private String formatNumber(Integer number) {
        DecimalFormat decimalFormat = new DecimalFormat("#,###");
        return decimalFormat.format(number);
    }
}
