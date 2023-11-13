package christmas.domain.event;

import christmas.domain.condition.ChristmasDayCondition;
import christmas.domain.condition.Condition;
import christmas.domain.menu.MenuItem;
import java.util.List;
import java.util.Map;

public class ChristmasDayEvent implements Event {

    @Override
    public List<Condition> getConditions() {
        return List.of(new ChristmasDayCondition());
    }

    @Override
    public String getEventName() {
        return null;
    }

    @Override
    public Integer getDiscountPrice(Map<MenuItem, Integer> menus) {
        return null;
    }
}
