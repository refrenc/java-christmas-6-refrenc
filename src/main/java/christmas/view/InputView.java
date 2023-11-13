package christmas.view;

import static camp.nextstep.edu.missionutils.Console.readLine;

public class InputView {

    static public int readDate() {
        System.out.println("12월 중 식당 예상 방문 날짜는 언제인가요? (숫자만 입력해 주세요!)");
        String input = readLine();
        if (!verifyDate(input)) {
            throw new IllegalArgumentException("[ERROR] 유효하지 않은 날짜입니다. 다시 입력해 주세요.");
        }

        return Integer.parseInt(input);
    }

    static public String readOrder() {
        System.out.println("주문하실 메뉴를 메뉴와 개수를 알려 주세요. (e.g. 해산물파스타-2,레드와인-1,초코케이크-1)");
        String input = readLine();
        if (!verifyOrder(input)) {
            throw new IllegalArgumentException("[ERROR] 유효하지 않은 주문입니다. 다시 입력해 주세요.");
        }

        return input;
    }

    static boolean verifyDate(String input) {
        // TODO: 1 이상 31 이하의 숫자
        return false;
    }

    static boolean verifyOrder(String input) {
        // TODO: {메뉴}-{개수}의 형식, 개수는 1 이상의 숫자, 메뉴 중복 불가, 존재하는 메뉴만 가능
        return false;
    }
}
