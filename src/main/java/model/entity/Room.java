package model.entity;

import model.util.Command;
import model.util.select.command.SelectToysByAge;
import model.util.select.command.SelectToysByType;
import model.util.sort.command.SortByAge;
import model.util.sort.command.SortByCost;
import model.util.sort.command.SortByCount;
import model.util.sort.command.SortByName;

import java.util.ArrayList;
import java.util.List;

public class Room {
    private int amount;
    private List<Toy> toys;
    Command command;


    public Room(int amount) {
        this.amount = amount;
    }

    public void buyToys() {
        int firstRecord = 1;
        toys = new ArrayList<>();

        for (Price price : Price.values()) {
            if (amount>=price.getCost()) {
                toys.add(new Toy(price.getName(), price.name(), price.getAgeMin(), price.getAgeMax(), price.getCost(), firstRecord));
                amount -= price.getCost();
            }
        }

        while (checkSolvency()) {
            for (Toy toy : toys) {
                if (amount >= toy.getCost()) {
                    toy.setCount(toy.getCount() + 1);
                    amount -= toy.getCost();
                }
            }
        }
    }

    private boolean checkSolvency() {
        for (Toy toy : toys) {
            if (amount >= toy.getCost()) {
                return true;
            }
        }
        return false;
    }

    public void sortByCount(){
        command = new SortByCount(this);
        command.execute();
    }
    public void sortByName(){
        command = new SortByName(this);
        command.execute();
    }

    public void sortByCost(){
        command = new SortByCost(this);
        command.execute();
    }

    public void sortByAge(){
        command = new SortByAge(this);
        command.execute();
    }

    public void selectToysByAge(String age){
        command = new SelectToysByAge(this, age);
        command.execute();
    }
    public void SelectToysByType(String name){
        command = new SelectToysByType(this, name);
        command.execute();
    }

    public List<Toy> getToys() {
        return toys;
    }

    public void setToys(List<Toy> toys) {
        this.toys = toys;
    }

    public int getAmount() {
        return amount;
    }
}
