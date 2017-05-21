package view;

import java.util.ResourceBundle;

public class ViewSort implements View {
    private ResourceBundle resourceBundle;

    public ViewSort() {
        resourceBundle = ResourceBundle.getBundle("message");
    }

    @Override
    public void printMunu() {
        printMessage(resourceBundle.getString("menu.sort"));
        printMessage(resourceBundle.getString("menu.1"), resourceBundle.getString("menu.sort.name"));
        printMessage(resourceBundle.getString("menu.2"), resourceBundle.getString("menu.sort.count"));
        printMessage(resourceBundle.getString("menu.3"), resourceBundle.getString("menu.sort.cost"));
        printMessage(resourceBundle.getString("menu.4"), resourceBundle.getString("menu.sort.age"));
    }

    @Override
    public void wrongInput() {
        printMessage(resourceBundle.getString("input.wrong.sort.int"));
    }

    @Override
    public ResourceBundle getResourceBundle() {
        return this.resourceBundle;
    }
}
