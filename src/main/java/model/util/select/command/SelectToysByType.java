package model.util.select.command;

import model.entity.Room;
import model.entity.Toy;
import model.util.Command;

import java.util.ArrayList;

public class SelectToysByType implements Command{
    Room room;
    String type;

    public SelectToysByType(Room room, String type) {
        this.room = room;
        this.type = type;
    }

    @Override
    public void execute() {
        ArrayList<Toy> list = new ArrayList<>();
        for (Toy toy : room.getToys()) {
            if (toy.getType().indexOf(type.toUpperCase())!=-1){
                list.add(toy);
            }
        }
        room.setToys(list);
    }
}
