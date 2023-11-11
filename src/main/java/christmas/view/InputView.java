package christmas.view;

import static camp.nextstep.edu.missionutils.Console.readLine;

public class InputView {

    public int readDate() {
        System.out.println("12월 중 식당 예상 방문 날짜는 언제인가요? (숫자만 입력해 주세요!)");
        String input = readLine();
        if (!verifyDate(input)) {
            throw new IllegalArgumentException("[ERROR]");
        }

        return Integer.parseInt(input);
    }

    public String readOrder() {
        System.out.println("주문하실 메뉴를 메뉴와 개수를 알려 주세요. (e.g. 해산물파스타-2,레드와인-1,초코케이크-1)");
        String input = readLine();
        if (!verifyOrder(input)) {
            throw new IllegalArgumentException("[ERROR]");
        }

        return input;
    }

    boolean verifyDate(String input) {
        // TODO: 1 이상 31 이하의 숫자
        return false;
    }

    boolean verifyOrder(String input) {
        // TODO: {메뉴}-{개수}의 형식, 개수는 1 이상의 숫자
        return false;
    }
}
