package jdk;

import java.util.Observable;

public class GPer extends Observable {
    private String name = "jdk.GPer 生态圈";
    private static GPer gPer = null;

    private GPer() {}

    public static GPer getInstance() {
        if (gPer==null) {
            gPer = new GPer();
        }
        return gPer;
    }

    public String getName() {
        return name;
    }

    public void publishQuestion(Question question){
        System.out.println(question.getUsername() + "在" + this.name + "上提交了一个问题");
        setChanged();
        notifyObservers(question);
    }
}
