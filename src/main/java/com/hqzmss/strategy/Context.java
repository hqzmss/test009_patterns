package com.hqzmss.strategy;

public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void print() {
        this.strategy.print();
    }
}
