package com.hqzmss.memento.use;

/**
 *此类便是备忘录了，这里存储的是Student类里的部分或全部状态
 */
public class Memento {
    private String name;
    private int age;
    private boolean sex;

    public Memento(String name, int age, boolean sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }
}
