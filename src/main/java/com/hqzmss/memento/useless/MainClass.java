package com.hqzmss.memento.useless;

public class MainClass {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("hqz");
        student.setAge(20);
        student.setSex(true);

        //保存原对象的状态信息(此操作与此类的职责无关)
        Student save = new Student();
        save.setAge(student.getAge());
        save.setName(student.getName());
        save.setSex(student.isSex());

        //修改原对象（这里才是此类应有的职责）
        student.setAge(10);
        student.setName("li");
        student.setSex(false);

        //恢复原对象的状态信息（此操作与此类的职责无关）
        student.setAge(save.getAge());
        student.setName(save.getName());
        student.setSex(save.isSex());
    }
}
