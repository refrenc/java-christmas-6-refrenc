package christmas.domain.condition;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ChristmasDayConditionTest {

    @Test
    void 크리스마스_디데이_할인_기간_테스트_참() {
        assertThat(new ChristmasDayCondition().isEventDay(25)).isTrue();
    }

    @Test
    void 크리스마스_디데이_할인_기간_테스트_거짓() {
        assertThat(new ChristmasDayCondition().isEventDay(31)).isFalse();
    }

    @Test
    void 크리스마스_디데이_할인_적용여부_테스트() {
        assertThat(new ChristmasDayCondition().isEventApplicable(10_000)).isTrue();
    }
}