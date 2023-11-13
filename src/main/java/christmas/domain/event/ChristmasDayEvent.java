package christmas.domain.event;

import christmas.domain.condition.ChristmasDayCondition;
import christmas.domain.condition.Condition;
import christmas.domain.menu.MenuItem;
import java.util.List;
import java.util.Map;

public class ChristmasDayEvent implements Event, DateEvent {

    private Integer discountPrice;
    private Integer date;

    @Override
    public void reservedAt(Integer date) {
        this.date = date;
    }

    @Override
    public List<Condition> getConditions() {
        return List.of(new ChristmasDayCondition());
    }

    @Override
    public String getEventName() {
        return "크리스마스 디데이 할인";
    }

    @Override
    public Integer getDiscountPrice() {
        return discountPrice;
    }

    @Override
    public void calculateDiscountPrice(Map<MenuItem, Integer> menus, Integer date) {
        discountPrice = 1000 + 100 * (date - 1);
    }
}
