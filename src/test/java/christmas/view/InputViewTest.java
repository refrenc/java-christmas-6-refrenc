package christmas.view;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.Test;

class InputViewTest {

    InputView inputView = new InputView();

    @Test
    void 방문_날짜_최소값_예외_테스트() {
        assertThatThrownBy(() -> inputView.verifyDate("0"))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void 방문_날짜_최대값_예외_테스트() {
        assertThatThrownBy(() -> inputView.verifyDate("32"))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void 방문_날짜_테스트() {
        assertThat(inputView.verifyDate("25")).isTrue();
    }

    @Test
    void 주문_예외_테스트() {
        assertThatThrownBy(() -> inputView.verifyOrder("메뉴"))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void 주문_개수_예외_테스트() {
        assertThatThrownBy(() -> inputView.verifyOrder("메뉴-0"))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void 주문_테스트() {
        assertThat(inputView.verifyDate("메뉴-3")).isTrue();
    }
}