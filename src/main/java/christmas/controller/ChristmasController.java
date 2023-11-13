package christmas.controller;

import christmas.domain.order.Order;
import christmas.service.ChristmasService;
import christmas.view.View;

public class ChristmasController {
    static private final ChristmasService christmasService = new ChristmasService();

    public void christmasEvent() {
        Integer date = View.readDate();
        String[] orders = View.readOrder().split(",");

        Order order = christmasService.getOrder(date, orders);

        View.printResult(order);
    }
}
