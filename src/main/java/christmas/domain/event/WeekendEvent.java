package christmas.domain.event;

import christmas.domain.condition.Condition;
import christmas.domain.condition.WeekendCondition;
import christmas.domain.menu.MenuItem;
import java.util.List;
import java.util.Map;

public class WeekendEvent implements Event{

    @Override
    public List<Condition> getConditions() {
        return List.of(new WeekendCondition());
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
