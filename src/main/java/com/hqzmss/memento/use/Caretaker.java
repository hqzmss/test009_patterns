package com.hqzmss.memento.use;

/**
 * 负责人，此类负责创建或获取一个备忘录
 */
public class Caretaker {
    private Memento memento;

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
