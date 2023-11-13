package christmas.domain.menu;

import static christmas.domain.menu.MenuItem.*;

import java.util.List;

public enum Menu {
    APPETIZER(List.of(양송이수프, 타파스, 시저샐러드)),
    MAIN(List.of(티본스테이크, 바비큐립, 해산물파스타, 크리스마스파스타)),
    DESSERT(List.of(초코케이크, 아이스크림)),
    BEVERAGE(List.of(제로콜라, 레드와인, 샴페인));

    List<MenuItem> menus;

    Menu(List<MenuItem> menus) {
        this.menus = menus;
    }

    public static Menu fromName(String name) {
        for (Menu menu : Menu.values()) {
            for (MenuItem menuItem : menu.menus) {
                if (menuItem.name().equals(name)) {
                    return menu;
                }
            }
        }
        throw new IllegalArgumentException("");
    }

    public static Integer getPrice(String name) {
        return null;
    }

    public static boolean isExist(String name) {
        return false;
    }
}
