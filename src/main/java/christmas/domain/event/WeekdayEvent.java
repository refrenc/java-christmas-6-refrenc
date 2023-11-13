package christmas.domain.event;

import christmas.domain.condition.Condition;
import christmas.domain.condition.WeekdayCondition;
import christmas.domain.menu.MenuItem;
import java.util.List;
import java.util.Map;

public class WeekdayEvent implements Event{

    @Override
    public List<Condition> getConditions()  {
        return List.of(new WeekdayCondition());
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