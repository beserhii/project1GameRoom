package model.util.sort.command;

import model.entity.Room;
import model.entity.Toy;
import model.util.Command;

import java.util.Comparator;

public class SortByName implements Command {
    Room room;

    public SortByName(Room room) {
        this.room = room;
    }

    @Override
    public void execute() {

        room.getToys().sort(new Comparator<Toy>() {
            @Override
            public int compare(Toy o1, Toy o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
    }
}
