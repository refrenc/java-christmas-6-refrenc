package christmas.domain.condition;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GiftConditionTest {

    @Test
    void 증정_이벤트_기간_테스트_참() {
        assertThat(new GiftCondition(0).isEventDay(4)).isTrue();
    }

    @Test
    void 증정_이벤트_적용여부_테스트_참() {
        assertThat(new GiftCondition(12_000).isEventApplicable()).isTrue();
    }

    @Test
    void 증정_이벤트_적용여부_테스트_거짓() {
        assertThat(new GiftCondition(1_000).isEventApplicable()).isFalse();
    }
}