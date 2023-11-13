package christmas.domain.condition;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class WeekdayConditionTest {

    @Test
    void 평일_할인_기간_테스트_참() {
        assertThat(new WeekdayCondition().isEventDay(4)).isTrue();
    }

    @Test
    void 평일_할인_기간_테스트_거짓() {
        assertThat(new WeekdayCondition().isEventDay(1)).isFalse();
    }

    @Test
    void 평일_할인_적용여부_테스트() {
        assertThat(new WeekdayCondition().isEventApplicable(10_000)).isTrue();
    }
}