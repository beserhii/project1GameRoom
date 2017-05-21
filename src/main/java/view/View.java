package view;

import java.util.ResourceBundle;

public interface View {

    void printMunu();
    void wrongInput();
    ResourceBundle getResourceBundle();

    default void printMessage(String ... message){
        System.out.println(concatMessage(message));
    }

    default String concatMessage(String... message){
        String result="";
        for (String s : message) {
            result+=s;
        }
        return result;
    }

    default void printResult(String... value) {
        //print (1-name, 2-age[min-max], 3-cost, 4-count)
        printMessage(
                getResourceBundle().getString("print.result.name"), value[0],
                getResourceBundle().getString("print.("),
                getResourceBundle().getString("print.result.age"), value[1], getResourceBundle().getString("print.space"),
                getResourceBundle().getString("print.result.cost"), value[2], getResourceBundle().getString("print.space"),
                getResourceBundle().getString("print.result.count"), value[3],
                getResourceBundle().getString("print.)"));
    }
}
