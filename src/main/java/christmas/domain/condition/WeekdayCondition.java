package christmas.domain.condition;

public class WeekdayCondition implements Condition {

    @Override
    public boolean isEventApplicable(Integer price) {
        return false;
    }

    @Override
    public boolean isEventDay(Integer date) {
        return false;
    }
}
