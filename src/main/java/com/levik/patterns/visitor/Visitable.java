package com.levik.patterns.visitor;

public interface Visitable {

    void accept(Visitor visitor);
}
