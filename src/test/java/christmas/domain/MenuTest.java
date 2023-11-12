package christmas.domain;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class MenuTest {

    @Test
    void 메뉴_가격_테스트() {
        assertThat(Menu.getPrice("제로콜라")).isEqualTo(3000);
    }

    @Test
    void 메뉴_존재_테스트() {
        assertThat(Menu.isExist("제로콜라")).isTrue();
    }

    @Test
    void 메뉴_비존재_테스트() {
        assertThat(Menu.isExist("스파게티")).isFalse();
    }

    @Test
    void 메뉴_타입_테스트() {
        assertThat(Menu.getMenuType("제로콜라")).isEqualTo(MenuType.Beverage);
    }
}