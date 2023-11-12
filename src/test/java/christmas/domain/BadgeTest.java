package christmas.domain;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BadgeTest {

    @Test
    void 배지_부여_테스트_없음() {
        assertThat(Badge.calculateBadge(100)).isEqualTo(Badge.NONE);
    }

    @Test
    void 배지_부여_테스트_별() {
        assertThat(Badge.calculateBadge(7000)).isEqualTo(Badge.STAR);
    }

    @Test
    void 배지_부여_테스트_트리() {
        assertThat(Badge.calculateBadge(10000)).isEqualTo(Badge.TREE);
    }

    @Test
    void 배지_부여_테스트_산타() {
        assertThat(Badge.calculateBadge(20000)).isEqualTo(Badge.SANTA);
    }
}