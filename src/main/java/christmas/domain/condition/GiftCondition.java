package christmas.domain.condition;

public class GiftCondition implements Condition {

    private static final Integer minTotalPrice = 120_000;

    @Override
    public boolean isEventApplicable(Integer price) {
        return false;
    }

    @Override
    public boolean isEventDay(Integer date) {
        return false;
    }
}
