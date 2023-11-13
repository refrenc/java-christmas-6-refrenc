package christmas.domain.condition;

public interface Condition {
    boolean isEventApplicable();
    boolean isEventDay(Integer date);
}
