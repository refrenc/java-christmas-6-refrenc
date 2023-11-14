package christmas.view;

import static camp.nextstep.edu.missionutils.Console.readLine;

import christmas.domain.menu.Menu;
import christmas.domain.menu.MenuItem;
import exception.BadDateException;
import exception.BadOrderException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class InputView {

    static public int readDate() {
        String input = readLine();
        verifyDate(input);

        return Integer.parseInt(input);
    }

    static public String readOrder() {
        String input = readLine();
        verifyOrder(input);

        return input;
    }

    static void verifyDate(String input) {
        // TODO: 1 이상 31 이하의 숫자
        try {
            Integer date = Integer.parseInt(input);
            if (date < 1 || date > 31) {
                throw new BadDateException();
            }
        } catch (NumberFormatException e) {
            throw new BadDateException();
        }
    }

    static void verifyOrder(String input) {
        // TODO: {메뉴}-{개수}의 형식, 개수는 1 이상의 숫자, 메뉴 중복 불가, 존재하는 메뉴만 가능, 음료만 주문 불가
        String[] orders = input.split(",");
        if (orders.length > 20
                || !validateOrderFormat(orders)
                || hasDuplicatedMenu(orders)
                || isBeverageOnly(orders)) {
            throw new BadOrderException();
        }
    }

    static private boolean validateOrderFormat(String[] orders) {
        for (String order : orders) {
            String[] fragment = order.split("-");
            String menu = fragment[0];
            if (fragment.length != 2
                    || convertStringToInteger(fragment[1]) < 1) {
                return false;
            }
        }

        return true;
    }

    static private boolean hasDuplicatedMenu(String[] orders) {
        List<MenuItem> menus = new ArrayList<>();
        for (String order : orders) {
            String[] fragment = order.split("-");
            String menu = fragment[0];
            if (menus.contains(MenuItem.fromName(menu))) {
                return true;
            }
            menus.add(MenuItem.fromName(menu));
        }

        return false;
    }

    static private Integer convertStringToInteger(String input) {
        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException e) {
            throw new BadOrderException();
        }
    }

    static private boolean isBeverageOnly(String[] orders) {
        Set<Menu> menuTypes = new HashSet<>();
        for (String order : orders) {
            String[] fragment = order.split("-");
            String menu = fragment[0];
            menuTypes.add(Menu.fromName(menu));
        }

        if (menuTypes.size() == 1 && menuTypes.contains(Menu.BEVERAGE)) {
            return true;
        }

        return false;
    }
}
