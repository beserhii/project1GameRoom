package controller;

import model.Model;
import model.entity.Room;
import model.entity.Toy;
import view.*;

public class UtilController {
    InputController inputController;
    Model model;
    Room room;
    View view;

    public UtilController(Model model, View view) {
        this.model = model;
        this.view = view;
        this.inputController = new InputController();
    }

    public void createRoom() {
        view = new ViewAmount();
        room = model.createRoom(Integer.parseInt(inputController.inputWithScanner(new ViewAmount(), Regex.REGEX_AMOUNT)));
    }

    public void sort() {
        view = new ViewSort();
        String sortType = inputController.inputWithScanner(view, Regex.REGEX_MENU);
        if (sortType.equals("1")) { //sortByName
            room.sortByName();
        } else if (sortType.equals("2")) {//sortByCount
            room.sortByCount();
        } else if(sortType.equals("3")) {//  //sortByCost
            room.sortByCost();
        } else if(sortType.equals("4")) {//  //sortByAge
            room.sortByAge();
        }
    }

    public void select() {
        view = new ViewSelect();
        String selectType = inputController.inputWithScanner(view, Regex.REGEX_MENU);
        if (selectType.equals("1")) {
            view = new ViewType();
            room.SelectToysByType(inputController.inputWithScanner(view, Regex.REGEX_STRING));
        } else if (selectType.equals("2")) {
            view = new ViewSize();
            room.SelectToysByType(inputController.inputWithScanner(view, Regex.REGEX_STRING));
        } else if(selectType.equals("3")) {
            view = new ViewAge();
            room.selectToysByAge(inputController.inputWithScanner(view, Regex.REGEX_AGE));
        }
    }

    public void printAllToys(){
        view.printMessage(view.getResourceBundle().getString("print.result"));
        for (Toy toy : room.getToys()) {
            view.printResult(toy.getName(), toy.getAge(), String.valueOf(toy.getCost()), String.valueOf(toy.getCount()));
        }
        view.printMessage();
    }
}


