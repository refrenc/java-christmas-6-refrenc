package christmas.domain.menu;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MenuItemTest {

    @Test
    void 메뉴_존재_테스트() {
        assertThat(MenuItem.fromName("제로콜라")).isEqualTo(MenuItem.제로콜라);
    }

    @Test
    void 메뉴_비존재_테스트() {
        assertThatThrownBy(() -> MenuItem.fromName("스파게티"))
                .isInstanceOf(IllegalArgumentException.class);
    }

}