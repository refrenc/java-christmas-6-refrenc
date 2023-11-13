package christmas.view;

import christmas.domain.order.Order;

public class View {

    public Integer readDate() {
        OutputView.printHello();
        while (true) {
            try {
                return InputView.readDate();
            } catch (IllegalArgumentException e) {
            }
        }
    }

    public String readOrder() {
        while (true) {
            try {
                return InputView.readOrder();
            } catch (IllegalArgumentException e) {
            }
        }
    }

    public void printResult(Order order) {
        OutputView.printDescription();
        OutputView.printMenu(order.getOrders());
        OutputView.printTotalPrice(order.getTotalPrice());
        OutputView.printGift(order.getGifts());
        OutputView.printDiscountList(order.getEvents(), order.getOrders());
        OutputView.printDiscountPrice(order.getDiscountPrice());
        OutputView.printDiscountedPrice(order.getDiscountedPrice());
        OutputView.printBadge(order.getBadge());
    }
}
