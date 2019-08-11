package com.itersive.sda.patterns.behavioral.observer;

import java.util.LinkedList;
import java.util.List;

public class Updater {
    private List<Room> rooms = new LinkedList<>();

    public void addObserver(Room room) {
        this.rooms.add(room);
    }

    public void removeObserver(Room room) {
        this.rooms.remove(room);
    }

    public void addNews(String news) {
        this.rooms.forEach(room -> room.update(news));
    }
}
