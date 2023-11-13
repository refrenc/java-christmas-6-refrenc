package christmas.domain.event;

import christmas.domain.condition.GiftCondition;
import christmas.domain.menu.MenuItem;
import christmas.domain.condition.Condition;
import java.util.List;
import java.util.Map;

public class ChristmasGiftEvent implements Event, GiftEvent {
    private static final MenuItem gift = MenuItem.샴페인;

    private List<Condition> conditions;
    private Integer discountPrice;

    public ChristmasGiftEvent() {
        this.conditions = List.of(new GiftCondition());
    }

    @Override
    public List<Condition> getConditions() {
        return this.conditions;
    }

    @Override
    public String getEventName() {
        return "증정 이벤트";
    }

    @Override
    public Integer getDiscountPrice() {
        return discountPrice;
    }

    @Override
    public void calculateDiscountPrice(Map<MenuItem, Integer> menus, Integer date) {
        discountPrice = gift.getPrice();
    }

    @Override
    public MenuItem getGift() {
        return gift;
    }
}
