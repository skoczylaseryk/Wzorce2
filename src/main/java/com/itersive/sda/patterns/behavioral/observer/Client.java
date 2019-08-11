package com.itersive.sda.patterns.behavioral.observer;

public class Client {
    public static void main(String[] args) {
        Updater observable = new Updater();
        Room studentsRoomObserver = new StudentsRoom();
        Room teachersRoomObserver = new TeachersRoom();

        observable.addObserver(studentsRoomObserver);
        observable.addObserver(teachersRoomObserver);

        observable.addNews("Some news");
    }
}
