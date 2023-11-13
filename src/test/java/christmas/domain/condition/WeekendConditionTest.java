package christmas.domain.condition;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class WeekendConditionTest {

    @Test
    void 평일_할인_기간_테스트_참() {
        assertThat(new WeekendCondition().isEventDay(1)).isTrue();
    }

    @Test
    void 평일_할인_기간_테스트_거짓() {
        assertThat(new WeekendCondition().isEventDay(4)).isFalse();
    }

    @Test
    void 평일_할인_적용여부_테스트() {
        assertThat(new WeekendCondition().isEventApplicable()).isTrue();
    }
}