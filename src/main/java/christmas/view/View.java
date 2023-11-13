package christmas.view;

public class View {

    public Integer readDate() {
        while (true) {
            try {
                return InputView.readDate();
            } catch (IllegalArgumentException e) {
            }
        }
    }

    public String readOrder() {
        while (true) {
            try {
                return InputView.readOrder();
            } catch (IllegalArgumentException e) {
            }
        }
    }

}
