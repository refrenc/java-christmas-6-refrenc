package christmas;

import christmas.controller.ChristmasController;

public class Application {

    private static final ChristmasController christmasController = new ChristmasController();

    public static void main(String[] args) {
        // TODO: 프로그램 구현
        christmasController.christmasEvent();
    }
}
