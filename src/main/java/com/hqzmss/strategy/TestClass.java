package com.hqzmss.strategy;

public class TestClass {
    public static void main(String[] args) {
        Context context = new Context(new ConcreteStrategyTwo());
        context.print();
    }
}
