package jdk;

import java.util.Observable;
import java.util.Observer;

public class Teacher implements Observer {
    private String name;

    public Teacher(String name) {
        this.name = name;
    }

    public void update(Observable o, Object arg) {
        GPer gPer = (GPer) o;
        Question question = (Question) arg;
        System.out.println("========================");
        System.out.println(name + "老师，你好");
        System.out.println("你收到了来自" + gPer.getName() + "的提问,提问者:" + question.getUsername() + "内容如下:" + question.getContent());
    }
}
