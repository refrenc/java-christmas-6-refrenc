package christmas.domain.menu;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class MenuTest {

    @Test
    void 메뉴_타입_테스트() {
        assertThat(Menu.fromName("제로콜라")).isEqualTo(Menu.BEVERAGE);
    }
}