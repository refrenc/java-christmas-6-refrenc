package christmas.service;

import christmas.domain.event.ChristmasDayEvent;
import christmas.domain.event.ChristmasGiftEvent;
import christmas.domain.event.Event;
import christmas.domain.event.SpecialDayEvent;
import christmas.domain.event.WeekdayEvent;
import christmas.domain.event.WeekendEvent;
import christmas.domain.menu.MenuItem;
import christmas.domain.order.Order;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ChristmasService {
    static final private List<Event> eventAll = List.of(new ChristmasDayEvent(),
            new WeekdayEvent(), new WeekendEvent(), new SpecialDayEvent(),
            new ChristmasGiftEvent());

    // TODO: Order 반환
    public Order getOrder(Integer date, String[] orders) {
        return new Order(eventAll, convertToList(orders), date);
    }

    // TODO: 주문 String을 Map으로 변환 후 리턴
    public Map<MenuItem, Integer> convertToList(String[] orders) {
        Map<MenuItem, Integer> result = new HashMap<>();

        for (String order : orders) {
            String[] fragment = order.split("-");
            String menu = fragment[0];
            Integer amount = Integer.parseInt(fragment[1]);

            result.put(MenuItem.fromName(menu), amount);
        }

        return result;
    }
}
