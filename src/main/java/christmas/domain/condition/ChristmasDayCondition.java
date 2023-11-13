package christmas.domain.condition;

public class ChristmasDayCondition implements Condition {

    @Override
    public boolean isEventApplicable() {
        return false;
    }

    @Override
    public boolean isEventDay(Integer date) {
        return false;
    }
}
