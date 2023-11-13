package christmas.domain.condition;

import java.util.List;

public class SpecialDayCondition implements Condition {

    private static final List<Integer> SPECIAL_DAY = List.of(3, 10, 17, 24, 25, 31);

    @Override
    public boolean isEventApplicable(Integer price) {
        return price >= 10_000;
    }

    @Override
    public boolean isEventDay(Integer date) {
        return SPECIAL_DAY.contains(date);
    }
}
