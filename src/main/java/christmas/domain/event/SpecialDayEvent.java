package christmas.domain.event;

import christmas.domain.condition.Condition;
import christmas.domain.condition.SpecialDayCondition;
import christmas.domain.menu.MenuItem;
import java.util.List;
import java.util.Map;

public class SpecialDayEvent implements Event {

    private Integer discountPrice;

    @Override
    public List<Condition> getConditions() {
        return List.of(new SpecialDayCondition());
    }

    @Override
    public String getEventName() {
        return "특별 할인";
    }

    @Override
    public Integer getDiscountPrice() {
        return discountPrice;
    }

    @Override
    public void calculateDiscountPrice(Map<MenuItem, Integer> menus, Integer date) {
        discountPrice = 1_000;
    }
}
