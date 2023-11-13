package christmas.domain.event;

import christmas.domain.condition.Condition;
import christmas.domain.condition.WeekendCondition;
import christmas.domain.menu.Menu;
import christmas.domain.menu.MenuItem;
import java.util.List;
import java.util.Map;

public class WeekendEvent implements Event {

    private static final Integer DISCOUNT_PER_MENU = 2_023;

    private Integer discountPrice;

    @Override
    public List<Condition> getConditions() {
        return List.of(new WeekendCondition());
    }

    @Override
    public String getEventName() {
        return "주말 할인";
    }

    @Override
    public Integer getDiscountPrice() {
        return discountPrice;
    }

    @Override
    public void calculateDiscountPrice(Map<MenuItem, Integer> menus, Integer date) {
        Integer result = 0;
        for (MenuItem menu : menus.keySet()) {
            if (Menu.fromName(menu.name()).equals(Menu.MAIN)) {
                result += DISCOUNT_PER_MENU;
            }
        }

        discountPrice = result;
    }
}
