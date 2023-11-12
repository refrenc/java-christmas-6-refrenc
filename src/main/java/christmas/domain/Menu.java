package christmas.domain;

import java.util.HashMap;
import java.util.Map;

public class Menu {

    public static Map<MenuType, Map<String, Integer>> menu = new HashMap<>() {{
        put(MenuType.Appetizer, new HashMap<>() {{
            put("양송이수프", 6000);
            put("타파스", 5500);
            put("시저샐러드", 8000);
        }});
        put(MenuType.Main, new HashMap<>() {{
            put("티본스테이크", 55000);
            put("바비큐립", 54000);
            put("해산물파스타", 35000);
            put("크리스마스파스타", 25000);
        }});
        put(MenuType.Dessert, new HashMap<>() {{
            put("초코케이크", 15000);
            put("아이스크림", 5000);
        }});
        put(MenuType.Beverage, new HashMap<>() {{
            put("제로콜라", 3000);
            put("레드와인", 60000);
            put("샴페인", 25000);
        }});
    }};

    public static Integer getPrice(String name) {
        return null;
    }

    public static boolean isExist(String name) {
        return false;
    }

    public static MenuType getMenuType(String name) {
        return null;
    }
}
