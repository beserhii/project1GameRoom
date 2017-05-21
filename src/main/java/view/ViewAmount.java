package view;

import java.util.ResourceBundle;

public class ViewAmount implements View {
    private ResourceBundle resourceBundle;

    public ViewAmount() {
        resourceBundle = ResourceBundle.getBundle("message");
    }

    @Override
    public void printMunu() {
        ResourceBundle resourceBundle = ResourceBundle.getBundle("message");
        printMessage(resourceBundle.getString("menu.create.amount"));
    }

    @Override
    public void wrongInput() {
        printMessage(resourceBundle.getString("input.wrong.amount.int"));
    }

    @Override
    public ResourceBundle getResourceBundle() {
        return this.resourceBundle;
    }
}
