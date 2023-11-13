package christmas.domain.condition;

public class ChristmasDayCondition implements Condition {

    @Override
    public boolean isEventApplicable(Integer price) {
        return price >= 10_000;
    }

    @Override
    public boolean isEventDay(Integer date) {
        return date <= 25;
    }
}
