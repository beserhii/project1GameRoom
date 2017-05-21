package view;

import java.util.ResourceBundle;

public class ViewSelect implements View {

    private ResourceBundle resourceBundle;

    public ViewSelect() {
        resourceBundle = ResourceBundle.getBundle("message");
    }

    @Override
    public void printMunu() {
        printMessage(resourceBundle.getString("menu.select"));
        printMessage(resourceBundle.getString("menu.1"), resourceBundle.getString("menu.select.type"));
        printMessage(resourceBundle.getString("menu.2"), resourceBundle.getString("menu.select.size"));
        printMessage(resourceBundle.getString("menu.3"), resourceBundle.getString("menu.select.age"));
    }

    @Override
    public void wrongInput() {
        printMessage(resourceBundle.getString("input.wrong.select.int"));
    }

    @Override
    public ResourceBundle getResourceBundle() {
        return this.resourceBundle;
    }
}
