package model;

import model.entity.Room;

public class Model{

    Room room;

    public Room createRoom(int amount) {
        room = new Room(amount);
        room.buyToys();
        return room;
    }

    public Room getRoom() {
        return room;
    }
}
