package christmas.domain.condition;

public class GiftCondition implements Condition {

    private static final Integer minTotalPrice = 120_000;

    private Integer TotalPrice;

    public GiftCondition(Integer totalPrice) {
        TotalPrice = totalPrice;
    }

    @Override
    public boolean isEventApplicable() {
        return false;
    }

    @Override
    public boolean isEventDay(Integer date) {
        return false;
    }
}
