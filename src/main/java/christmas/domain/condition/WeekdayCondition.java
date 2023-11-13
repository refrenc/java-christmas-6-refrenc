package christmas.domain.condition;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class WeekdayCondition implements Condition {

    @Override
    public boolean isEventApplicable(Integer price) {
        return price >= 10_000;
    }

    @Override
    public boolean isEventDay(Integer date) {
        LocalDate reservedAt = LocalDate.of(2023, 12, date);
        return !(reservedAt.getDayOfWeek().equals(DayOfWeek.FRIDAY)
                || reservedAt.getDayOfWeek().equals(DayOfWeek.SATURDAY));
    }
}
