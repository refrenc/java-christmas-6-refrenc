package christmas.domain.event;

import christmas.domain.condition.Condition;
import christmas.domain.menu.MenuItem;
import java.util.List;
import java.util.Map;

public interface Event {
    List<Condition> getConditions();
    String getEventName();
    Integer getDiscountPrice(Map<MenuItem, Integer> menus);
}
