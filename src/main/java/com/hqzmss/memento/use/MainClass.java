package com.hqzmss.memento.use;

public class MainClass {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("hqz");
        student.setAge(9);
        student.setSex(true);
        Caretaker caretaker = new Caretaker();

        //创建备忘录
        caretaker.setMemento(student.createMemento());

        //修改原对象信息
        student.setName("123");

        //恢复原对象的状态信息
        student.restoreMemento(caretaker.getMemento());
    }
}
