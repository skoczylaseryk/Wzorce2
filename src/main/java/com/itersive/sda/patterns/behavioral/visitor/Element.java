package com.itersive.sda.patterns.behavioral.visitor;

public abstract class Element {
    public abstract void accept(Visitor v);
}
