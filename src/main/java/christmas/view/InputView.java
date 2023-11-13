package christmas.view;

import static camp.nextstep.edu.missionutils.Console.readLine;

import christmas.domain.menu.Menu;
import christmas.domain.menu.MenuItem;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class InputView {

    static public int readDate() {
        System.out.println("12월 중 식당 예상 방문 날짜는 언제인가요? (숫자만 입력해 주세요!)");
        String input = readLine();
        verifyDate(input);

        return Integer.parseInt(input);
    }

    static public String readOrder() {
        System.out.println("주문하실 메뉴를 메뉴와 개수를 알려 주세요. (e.g. 해산물파스타-2,레드와인-1,초코케이크-1)");
        String input = readLine();
        verifyOrder(input);

        return input;
    }

    static void verifyDate(String input) {
        // TODO: 1 이상 31 이하의 숫자
        try {
            Integer date = Integer.parseInt(input);
            if (date < 1 || date > 31) {
                throw new IllegalArgumentException("[ERROR] 유효하지 않은 날짜입니다. 다시 입력해 주세요.");
            }
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("[ERROR] 유효하지 않은 날짜입니다. 다시 입력해 주세요.");
        }
    }

    static void verifyOrder(String input) {
        // TODO: {메뉴}-{개수}의 형식, 개수는 1 이상의 숫자, 메뉴 중복 불가, 존재하는 메뉴만 가능
        String[] orders = input.split(",");
        List<MenuItem> menus = new ArrayList<>();
        Set<Menu> menuTypes = new HashSet<>();
        for (String order : orders) {
            String[] fragment = order.split("-");
            String menu = fragment[0];
            if (fragment.length != 2
                    || menus.contains(MenuItem.fromName(menu))
                    || convertStringToInteger(fragment[1]) < 1) {
                throw new IllegalArgumentException("[ERROR] 유효하지 않은 주문입니다. 다시 입력해 주세요.");
            }
            menus.add(MenuItem.fromName(menu));
            menuTypes.add(Menu.fromName(menu));
        }

        isBeverageOnly(menuTypes);
    }

    static private Integer convertStringToInteger(String input) {
        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("[ERROR] 유효하지 않은 주문입니다. 다시 입력해 주세요.");
        }
    }

    static private void isBeverageOnly(Set<Menu> menus) {
        if (menus.size() == 1 && menus.contains(Menu.BEVERAGE)) {
            throw new IllegalArgumentException("[ERROR] 유효하지 않은 주문입니다. 다시 입력해 주세요.");
        }
    }
}
