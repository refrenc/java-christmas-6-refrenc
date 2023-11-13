package christmas.domain.condition;

public class GiftCondition implements Condition {

    private static final Integer MIN_TOTAL_PRICE = 120_000;

    @Override
    public boolean isEventApplicable(Integer price) {
        return price >= MIN_TOTAL_PRICE;
    }

    @Override
    public boolean isEventDay(Integer date) {
        return true;
    }
}
