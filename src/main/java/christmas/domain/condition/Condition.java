package christmas.domain.condition;

public interface Condition {
    boolean isEventApplicable(Integer price);
    boolean isEventDay(Integer date);
}
