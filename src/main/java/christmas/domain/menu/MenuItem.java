package christmas.domain.menu;

public enum MenuItem {
    양송이수프(6_000),
    타파스(5_500),
    시저샐러드(8_000),
    티본스테이크(55_000),
    바비큐립(54_000),
    해산물파스타(35_000),
    크리스마스파스타(25_000),
    초코케이크(15_000),
    아이스크림(5_000),
    제로콜라(3_000),
    레드와인(60_000),
    샴페인(25_000);

    Integer price;

    MenuItem(Integer price) {
        this.price = price;
    }

    public Integer getPrice() {
        return price;
    }

    public static MenuItem fromName(String name) {
        for (MenuItem menu : MenuItem.values()) {
            if (menu.name().equals(name)) {
                return menu;
            }
        }
        throw new IllegalArgumentException("[ERROR] 유효하지 않은 주문입니다. 다시 입력해 주세요.");
    }
}
