package view;

import java.util.ResourceBundle;

public class ViewSize implements View {

    private ResourceBundle resourceBundle;

    public ViewSize() {
        resourceBundle = ResourceBundle.getBundle("message");
    }

    @Override
    public void printMunu() {
        printMessage(resourceBundle.getString("menu.param.size"));
    }

    @Override
    public void wrongInput() {

    }

    @Override
    public ResourceBundle getResourceBundle() {
        return this.resourceBundle;
    }
}
