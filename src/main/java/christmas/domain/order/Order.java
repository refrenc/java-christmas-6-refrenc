package christmas.domain.order;

import christmas.domain.Badge;
import christmas.domain.event.Event;
import christmas.domain.event.GiftEvent;
import christmas.domain.menu.MenuItem;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Order {

    private List<Event> events;
    private Map<MenuItem, Integer> orders;

    public List<Event> getEvents() {
        return events;
    }

    public Map<MenuItem, Integer> getOrders() {
        return orders;
    }

    public Badge getBadge() {
        return Badge.calculateBadge(getDiscountPrice());
    }

    public Integer getTotalPrice() {
        return null;
    }

    public Integer getDiscountPrice() {
        return null;
    }

    public Integer getDiscountedPrice() {
        return getTotalPrice() - getDiscountPrice();
    }

    public Map<MenuItem, Integer> getGifts() {
        Map<MenuItem, Integer> result = new HashMap<>();
        for(Event event : events) {
            if(event instanceof GiftEvent) {
                result.put(((GiftEvent) event).getGift(), 1);
            }
        }

        return result;
    }
}
