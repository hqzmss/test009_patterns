package com.hqzmss.memento.use;

public class Student {
    private String name;
    private boolean sex;
    private int age;

    /**
     * 创建并返回一个新的备忘录
     * @return 新的备忘录
     */
    public Memento createMemento() {
        return new Memento(name, age, sex);
    }

    /**
     * 使用一个备忘录恢复原对象
     * @param memento 备忘录
     */
    public void restoreMemento(Memento memento) {
        this.name = memento.getName();
        this.sex = memento.isSex();
        this.age = memento.getAge();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
