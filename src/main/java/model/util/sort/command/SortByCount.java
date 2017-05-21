package model.util.sort.command;

import model.entity.Room;
import model.entity.Toy;
import model.util.Command;

import java.util.Comparator;

public class SortByCount implements Command {
    Room room;

    public SortByCount(Room room) {
        this.room = room;
    }

    @Override
    public void execute() {
        room.getToys().sort(new Comparator<Toy>() {
            @Override
            public int compare(Toy o1, Toy o2) {
                if (o1.getCount() > o2.getCount()) {
                    return 1;
                } else if (o1.getCount() < o2.getCount()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });
    }
}
