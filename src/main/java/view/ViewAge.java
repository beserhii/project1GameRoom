package view;

import java.util.ResourceBundle;

public class ViewAge implements View {
    private ResourceBundle resourceBundle;

    public ViewAge() {
        resourceBundle = ResourceBundle.getBundle("message");
    }

    @Override
    public void printMunu() {
        printMessage(resourceBundle.getString("menu.param.age"));
    }

    @Override
    public void wrongInput() {
        printMessage(resourceBundle.getString("input.wrong.age.int"));
    }

    @Override
    public ResourceBundle getResourceBundle() {
        return this.resourceBundle;
    }
}
