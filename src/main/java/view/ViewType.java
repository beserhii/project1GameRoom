package view;

import java.util.ResourceBundle;

public class ViewType implements View {
    private ResourceBundle resourceBundle;

    public ViewType() {
        resourceBundle = ResourceBundle.getBundle("message");
    }

    @Override
    public void printMunu() {
        printMessage(resourceBundle.getString("menu.param.type"));
    }

    @Override
    public void wrongInput() {

    }

    @Override
    public ResourceBundle getResourceBundle() {
        return this.resourceBundle;
    }
}
