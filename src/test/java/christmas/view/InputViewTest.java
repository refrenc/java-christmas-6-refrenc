package christmas.view;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.assertj.core.api.Assertions;
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
        try {
            inputView.verifyDate("25");
        } catch (IllegalArgumentException e) {
            Assertions.fail("");
        }
    }

    @Test
    void 주문_형식_예외_테스트() {
        assertThatThrownBy(() -> inputView.verifyOrder("타파스"))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void 주문_없는_메뉴_예외_테스트() {
        assertThatThrownBy(() -> inputView.verifyOrder("메뉴-2"))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void 주문_개수_예외_테스트() {
        assertThatThrownBy(() -> inputView.verifyOrder("타파스-0"))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void 주문_중복_예외_테스트() {
        assertThatThrownBy(() -> inputView.verifyOrder("타파스-2,타파스-1"))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void 주문_음료만_예외_테스트() {
        assertThatThrownBy(() -> inputView.verifyOrder("샴페인-1,제로콜라-1"))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void 주문_테스트() {
        try {
            inputView.verifyOrder("샴페인-3,타파스-2");
        } catch (IllegalArgumentException e) {
            Assertions.fail("");
        }
    }
}