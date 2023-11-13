package christmas.domain.event;

import christmas.domain.condition.GiftCondition;
import christmas.domain.menu.MenuItem;
import christmas.domain.condition.Condition;
import java.util.List;
import java.util.Map;

public class ChristmasGiftEvent implements Event, GiftEvent{

    private List<Condition> conditions;

    public ChristmasGiftEvent(Integer totalPrice) {
        this.conditions = List.of(new GiftCondition(totalPrice));
    }

    @Override
    public List<Condition> getConditions() {
        return this.conditions;
    }

    @Override
    public String getEventName() {
        return null;
    }

    @Override
    public Integer getDiscountPrice(Map<MenuItem, Integer> menus) {
        return null;
    }

    @Override
    public MenuItem getGift() {
        return MenuItem.샴페인;
    }
}
