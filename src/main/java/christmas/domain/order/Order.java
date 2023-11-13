package christmas.domain.order;

import christmas.domain.Badge;
import christmas.domain.condition.Condition;
import christmas.domain.event.DateEvent;
import christmas.domain.event.Event;
import christmas.domain.event.GiftEvent;
import christmas.domain.menu.MenuItem;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Order {

    private List<Event> events;
    private Map<MenuItem, Integer> orders;
    private Integer date;

    public Order(List<Event> eventAll, Map<MenuItem, Integer> orders, Integer date) {
        this.orders = orders;
        this.events = filterEvent(eventAll, orders, date);
        this.date = date;
    }

    public List<Event> getEvents() {
        return events;
    }

    public Map<MenuItem, Integer> getOrders() {
        return orders;
    }

    private List<Event> filterEvent(List<Event> eventAll, Map<MenuItem, Integer> orders,
            Integer date) {
        List<Event> result = new ArrayList<>();
        for (Event event : eventAll) {
            if (event instanceof DateEvent) {
                ((DateEvent) event).reservedAt(date);
            }
            if (isEventApplicable(event.getConditions(), date, getTotalPrice())) {
                result.add(event);
                event.calculateDiscountPrice(orders, date);
            }
        }
        return result;
    }

    private boolean isEventApplicable(List<Condition> conditions, Integer date, Integer price) {
        for (Condition condition : conditions) {
            if (condition.isEventDay(date) && condition.isEventApplicable(price)) {
                return true;
            }
        }

        return false;
    }

    public Badge getBadge() {
        return Badge.calculateBadge(getDiscountPrice());
    }

    public Integer getTotalPrice() {
        Integer result = 0;
        for (MenuItem key : orders.keySet()) {
            result += key.getPrice() * orders.get(key);
        }

        return result;
    }

    public Integer getDiscountPrice() {
        Integer result = 0;
        for (Event event : events) {
            result += event.getDiscountPrice();
        }

        return result;
    }

    public Integer getDiscountedPrice() {
        return getTotalPrice() - getDiscountPrice() + getGiftPrice(getGifts());
    }

    private Integer getGiftPrice(Map<MenuItem, Integer> gifts) {
        Integer result = 0;
        for(MenuItem menu : gifts.keySet()) {
            result += menu.getPrice() * gifts.get(menu);
        }

        return result;
    }

    public Map<MenuItem, Integer> getGifts() {
        Map<MenuItem, Integer> result = new HashMap<>();
        for (Event event : events) {
            if (event instanceof GiftEvent) {
                result.put(((GiftEvent) event).getGift(), 1);
            }
        }

        return result;
    }
}
