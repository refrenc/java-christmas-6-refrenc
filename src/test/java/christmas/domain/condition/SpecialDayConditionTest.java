package christmas.domain.condition;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SpecialDayConditionTest {

    @Test
    void 특별_할인_기간_테스트_참() {
        assertThat(new SpecialDayCondition().isEventDay(25)).isTrue();
    }

    @Test
    void 특별_할인_기간_테스트_거짓() {
        assertThat(new SpecialDayCondition().isEventDay(1)).isFalse();
    }

    @Test
    void 특별_할인_적용여부_테스트() {
        assertThat(new SpecialDayCondition().isEventApplicable(10_000)).isTrue();
    }
}