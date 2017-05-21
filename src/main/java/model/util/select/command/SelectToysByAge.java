package model.util.select.command;

import model.entity.Room;
import model.entity.Toy;
import model.util.Command;

import java.util.ArrayList;

public class SelectToysByAge implements Command {
    Room room;
    int ageMin;
    int ageMax;

    public SelectToysByAge(Room room, String age) {
        int index;
        this.room = room;
        index = age.indexOf("-");
        this.ageMin = Integer.parseInt(age.substring(0,index));
        this.ageMax = Integer.parseInt(age.substring(index+1, age.length()));
    }

    @Override
    public void execute() {
        ArrayList<Toy> list = new ArrayList<>();
        for (Toy toy : room.getToys()) {
            if (toy.getAgeMin()<=ageMax && toy.getAgeMax()>=ageMin){
                list.add(toy);
            }
        }
        room.setToys(list);
    }
}
