package com.itersive.sda.patterns.behavioral.visitor;

import java.util.ArrayList;
import java.util.List;

public class Document extends Element{
    List<Element> elements = new ArrayList<>();

    @Override
    public void accept(Visitor v) {
        elements.forEach(e -> e.accept(v));
    }
}
