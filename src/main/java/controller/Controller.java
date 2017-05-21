package controller;

import model.Model;
import view.*;

public class Controller {
    Model model;
    View view;

    public Controller(Model model) {
        this.model = model;
    }

    public void processUser() {
        UtilController utilController = new UtilController(model, view);
        utilController.createRoom();
        utilController.printAllToys();

        utilController.sort();
        utilController.printAllToys();

        utilController.select();
        utilController.printAllToys();
    }
}
