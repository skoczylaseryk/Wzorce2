package com.itersive.sda.patterns.behavioral.observer;

import java.util.List;

public class TeachersRoom implements Room {
    private List<String> messages;

    @Override
    public void update(Object o) {
        messages.add(o.toString());
    }
}
